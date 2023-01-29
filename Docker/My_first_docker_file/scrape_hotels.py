## Installing requirements
# pip install requests
# pip install bs4
# pip install html5lib

import requests
from bs4 import BeautifulSoup
# url = 'https://www.hotelcontactnumber.in/hotels-in-indore-209.html/pag='
Hotel_no = 1
Page_no = 1

f = open('hotel_data.txt', 'w')

for pg_no in range(1,23):
    print('Page number : ',Page_no)
    f.write('Page number : {}\n'.format(Page_no))
    Page_no+=1
    # print(url+str(pg_no)+'/')
    ## Step 1: Get HTML
    # r = requests.get(url)
    url = 'https://www.hotelcontactnumber.in/hotels-in-indore-209.html/pag='
    r = requests.get(url+str(pg_no)+'/')
    # print(url+str(pg_no)+'/')
    htmlcontent = r.content
    # print(htmlcontent)

    ## Step 2: Parse the HTML
    soup = BeautifulSoup(htmlcontent, 'html.parser')

    # print(soup.prettify)
    # ht = soup.find_all('div', id="rht_coll")
    # print(ht)
    all_hotel = soup.find_all('div', class_ = "city_title")
    for hotels in all_hotel:
        hotel_name = hotels.h3.text
        hotel_url = hotels.find('a', href=True)
        print('S.no : ',Hotel_no)
        f.write('S.no : {}\n'.format(Hotel_no))
        Hotel_no+=1
        print('Hotel name : ',hotel_name)
        f.write('Hotel name : {}\n'.format(hotel_name))
        print('Website : ',hotel_url.get('href'))
        f.write('Website : {}\n'.format(hotel_url.get('href')))

        url = hotel_url.get('href')
        r = requests.get(url)
        htmlcontent = r.content
        soup = BeautifulSoup(htmlcontent, 'html.parser')
        contact_info = soup.find('div', class_ = 'table_address')
        # print(contact_info)
        address = contact_info.find_all('td')
        left = contact_info.find_all('td',class_ = 'table_space_td_left')
        right = contact_info.find_all('td',class_ = 'table_space_td_right')
        # print(address)
        for list in range(len(left)):
            print(left[list].text, " : ", right[list].text)
            f.write(left[list].text)
            f.write(" : ")
            f.write(right[list].text)
            f.write('\n')
        # print(contact_info.find('td', class_='table_space_td_right').text)
        print('Phone number : ', contact_info.find('td', class_='table_space_td_right1').text)
        f.write('Phone number : ')
        f.write(contact_info.find('td', class_='table_space_td_right1').text)
        f.write('\n')
        print('\n______________________________________________________\n')
        f.write('______________________________________________________________\n')















# for hotels in all_hotel:
#     hotel_name = hotels.h3.text
#     hotel_link = hotels.a
#     print(hotel_name)
    # print(hotel_link)

# tags = soup.find_all('a')
# for x in tags:
#     print(x)

















# # print(soup)
# # print(soup.prettify)

# ## Step 3: HTML Tree traversal

# # comonnly used types of object 
# # print(type(title)) # 1. Tag
# # print(soup.title.string) # 2. Nevigable String 
# # print(type(soup)) # 3. BeautifulSoup
# # 4. Comment

# # Getting the tittle of HTML page 
# title = soup.title

# paras = soup.find_all('p')
# # print(soup.get_text())

# # Get all the anchor tags from the page 
# anchors = soup.find_all('a')
# all_links = set()

# # Get all links from the page 
# for link in anchors:
#     if(link.get('href')!='#'):
#         link = link.get('href')
#         all_links.add(link)
#         print(link)

# # print(soup.find_all(class_ = "city_title"))
# # ids = soup.find(id = "breadcrumb")
# # print(ids.strings)
