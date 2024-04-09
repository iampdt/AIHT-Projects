# A Generative Adversarial Network (GAN) Technique for Internet of Medical Things Data  

The proposed work aims to create a dataset linked to the Internet of Medical Things (IoMT) context by exploiting an innovative approach to create synthetic dataset by using Generative Adversarial Networks (GANs). In particular, the synthetic dataset is created by using GANs network starting from data retrieved by the IoT sensors. 

## Getting Started

In order to user the dataset, simply download the repository and start to work with the xlsx files. More information are available at the following page: [Vaccari, I.; Orani, V.; Paglialonga, A.; Cambiaso, E.; Mongelli, M. A Generative Adversarial Network (GAN) Technique for Internet of Medical Things Data. Sensors 2021, 21, 3726.](https://www.mdpi.com/1424-8220/21/11/3726)


Please if you use this dataset in a research work, please cite this article.

### IoMT devices adopted

The devices adopted to retrieve patients data are:
* An electrocardiogram (ECG) patch also providing day/night movement monitoring,
* A pulse meter providing oximetry monitoring,
* A weight scale,
* A sphygmomanometer for blood pressure monitoring,
* A spirometer for peak flow and FEV1 parameters.

Data are collected every day for three consecutive months: *oxygen, body temperature, heart rate, heart rate master, weight, Body Mass Index, FEV1, PEF, MAP, diastolic blood pressure, systolic blood pressure*.

### Repository organization

The repository is composed by 3 folder:

* Data
    * Input
        * dataPneulytics.xlsx
    * Output
        * GenData{1-11}.xlsx
* summary.xlsx


In the Data folder, two folders are presented: in the Input folder, the data retrieved by the IoMT sensors are reported while in the Output folder, the synthetic dataset generated through the GANs is uploaded. In the *summary.xslx*, results about comparison between the synthetic and real dataset are reported in terms of Jensen–Shannon (JS) divergence, Fréchet Inception Distance (FID), accuracy and F1 score.  


## Authors

* **Ivan Vaccari** - *Concept, implementation, elaboration, paper writer* - [Profile](https://www.ieiit.cnr.it/people/Vaccari-Ivan)
* **Vanessa Orani** - *implementation, elaboration,* - [Profile](https://www.ieiit.cnr.it/people/Orani-Vanessa)
* **Alessia Paglialonga** - *Supervisor, paper reviewer* - [Profile](https://www.ieiit.cnr.it/people/Paglialonga-Alessia)
* **Enrico Cambiaso** - *Supervisor, elaboration, paper collaboration* - [Profile](https://www.ieiit.cnr.it/people/Cambiaso-Enrico)
* **Maurizio Mongelli** - *Machine learning support and contribution* - [Profile](https://www.ieiit.cnr.it/people/Mongelli-Maurizio)
