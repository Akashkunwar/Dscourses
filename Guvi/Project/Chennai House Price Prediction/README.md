# **Chennai House Price Prediction**
Repository containing comparisons between different machine learning algorithms in Chennai House Price Prediction datasets.

# Table of Contents

* [The Concept](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-concept)
* [The Data](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-data)
* [Data Cleaning](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-cleaning)
* [EDA (Exploratory data analysis)](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-concept#EDA-(Exploratory-data-analysis))
* [Encoding](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-concept#Encoding)
* [Scaling](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#Scaling)
* [ML Model Deployment](https://github.com/Akashkunwar/Dscourses/tree/main/Guvi/Project/Chennai%20House%20Price%20Prediction#the-concept#ML-Model-Deployment)


## The Concept

Hwew i try different classic algorithms in a dataset to experiment and see how each one behaves.

It's an attempt to answer some questions:

 * How does different models compare to each other in equal conditions?
 * What's the impact of fine-tuning (using Grid Search or other methods) the models?
 * What's the impact of data normalization in different models?
 * Is it ok to use out-of-the-box scikit-learn's models?
 * When to use Machine Learning after all? Are there situations where is better not to use ML models?

## The Data

A brief of the datasets, the models is final sales price of house. It is not sufficient to just fit a model - the model must be analysed to find the important factors that contribute towards the price. Also, it will be better to give a forecast range (range of permissible values) rather than a single estimate as it will help the customers to negotiate.

## Data Cleaning

 Here we have cleaned the data removed all the unnecessary columns filled or removed missing values arranged all the data and proper format and data type. On top of that we have corrected the spellings and removed spaces.

## EDA (Exploratory data analysis)

 First have tried to figure out the distribution of data whether it is normally distributed or not and plotted some graphs. Here after that, we have plotted our data and try to figure out the straight line pattern or any relation between all the columns versus our target: which is total sales price.

### Distrubution of Data
![Comparison Between Models in the Fashion MNIST dataset](https://i.imgur.com/mxl3ZmV.png)

### Plotting Features column vs Target column

Here we plot two type of data:
*   Numerical Columns
*   Categorical Columns

![Comparison Between Models in the Fashion MNIST dataset](https://i.imgur.com/hp9Jvj5.png)

### Plotting of Numerical data vs Target
Here we are plotting all our Numerical columns with total price of the house to figure out, is there any relation between numerical features column and total sales.

#### Here we plot 2 type of numerical data:


1.   Continous numerical variable
2.   Decsrete numerical variable




![Comparison Between Models in the Fashion MNIST dataset](https://i.imgur.com/gTq6DQE.png)
------------

## Encoding

From here onwards encoding of data will start in for categorical data in sequential manner in numerical so that computer can understand those data columns.

Here we are encoding ordinal categorical columns which have some order present in them and we have to preserve the order so here we use Lebel/Ordinal encoder. and for un ordered data we use OneHotEncoder.

Here after encoding all columns we can see that in categorical columns also there are some correlation between target and features as we can there is a very good correlation between some columns of our data which are soon in reddish colour.

## Scaling

Here we can clearly see in our features column int_sqft is the only feature which which contains very large value and all the remaining of the feature column are pretty small.
![Unscaled data](https://i.imgur.com/lF7XI4U.png)
Here with the help of MinMaxScaler and StandardScaler we are trying to scale the data so that the spread of values between all the features become equal so that the model which train the data by using distace distance doesn't get very large values as their features.
![MinMaxScaled Data](https://i.imgur.com/IlrCUHS.png)
![StandarScaled Data](https://i.imgur.com/8pGQN95.png)


## ML Model Deployment

From here on we will start building model on top of data which we have prepared till now and we will try all different kind of machine learning models and try to get best r-square score for all 3 type of data that are normaldata, MinMaxScaled data and StandardScaler data.

Here after training all kinds of model we can see that MinMaxScaled or StandardScaled data model doesn't matter make much difference they give very similar results. 

But we can surely say that GradientBoostingRegressor and XGBRegressor outperformed most of the machine learning model and GradientBoostingRegressor give 0.99693 as R2-score and XGBRegressor gives 0.997693 as R2-score and I would also like to mention ExtraTreesRegressor with R2-score of 0.99094. The results of all the models of the child being trained in this project I mentioned below:

|ML Model |R2-Score|
|-----|--------|
|Gradient Boosting Regressor|0.99693       |
|XGB Regressor |0.997693      |
|Extra Trees Regressor|0.99094       |
|Random Forest Regressor |0.9867256      |
|Linear Regression |0.923446      |
|KNeighbors Regressor|0.952777       |
|VotingRegressor  |0.97596      |

No surprises here. The XGB Regressor model and Gradient Boosting Regressor outperformed most of the model.


Through this Machine Learning project we can conclude that there are so many aspects of training machine learning model fitst we have to clean the data and try to get all the features in a suitable format. There are many variables and features which which play their part in setting the price of the house in this particular dataset so we have to keep all the columns or features into consideration while training the model we should focus as much as possible an explorer tree data analysis and try to find the pattern in categorical data also any medical data we can find pattern through various Matrix but in categorical data we have to get enough time to find a relation between two variables is that there is no linear relation then we can try to transform the data but here that was not the case after that we encoded our categorical column in order for ordinal data and by one hot encoder for nominal data and removed all the columns which have no relation with target columns. After that it comes the training the machine learning model part and here we train data with as many model as possible and try to get the best possible RS Square score as we can and at the end we finalise a model with highest RS Square score for this data which gave score of more than 99% (99.769% to be exact).

The notebook is avaiable in the [Chennai House Price Prediction](https://github.com/Akashkunwar/Dscourses/blob/main/Guvi/Project/Chennai%20House%20Price%20Prediction/Chennai_house_price_project.ipynb) and also on [Google Colab](https://colab.research.google.com/github/Akashkunwar/Dscourses/blob/main/Guvi/Project/Chennai_house_price_project.ipynb).

## About
[![forthebadge made-with-python](http://ForTheBadge.com/images/badges/made-with-python.svg)](https://www.python.org/)

[![Made withJupyter](https://img.shields.io/badge/Made%20with-Jupyter-orange?style=for-the-badge&logo=Jupyter)](https://jupyter.org/try)
