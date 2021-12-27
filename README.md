1. Describe basic aspects of AWS Elastic Compute Cloud.
AWS Elastic Compute Cloud, create and connect in a virtual machines, create vpc and set the security for inbound and outbound traffic.
Install Apache, PHP and MySQL server in a Linux instance and perform all configurations.
Install httpd mariadb-server and write html code on aws ec2.
2. How to create a virtual machine instance in AWS EC2.
First, you have to log in to AWS console
On the Console Dashboard, click on EC2.
On the Amazon EC2 console, click on Launch Instance.
Click on the “Select” button in the row with the required operating system.
Choose the family and typer as per requirement, here we choose t2micro (free instance type).
Create Security Group.
Click on “Review and Launch”.
Click on Launch.
3. How to install an Apache webserver on AWS EC2 Instance.
Connect putty to aws ec2 and get sudo access by typing "sudo su".
Because these EC2 instance have internet access by default , we will directly install the Apache HTTP server from Yum repository 
Shoot following command on Putty session:
         "yum -y install httpd"
httpd is the package name of Apache HTTP server. The above command will install Apache on your EC2 instance.
Now permanently enable httpd service through following command 
         "systemctl enable httpd"
Once httpd service is enabled you need to start the httpd service through following command:
      "systemctl start httpd"
To test that Apache HTTP server has been successfully installed on EC2 Linux machine and is able to process HTTP request, try to browse the Public DNS name of EC2 instance from local machines browser.
If browser shows the Apache Test pages then you have successfully configured the Apache HTTP server on your EC2 instance.

4. How we can connect an AWS EC2 instance to a MySQL server database.
We can connect to database on EC2 using SSH Tunnel. You can ssh and can use mysql -u username -p command to login into the mysql server. You can install phpmyadmin to access the mysqlk server from browser. Launch Amazon EC2 Instance and obtain a new key pair.
5. How to connect a domain to your website using Route 53.
Login into your AWS Management Console and head towards Route 53
In Route 53 –> Click Hosted zones – > Click Create Hosted Zone
Fill in Domain Name and select Type as Public Hosted Zone and click create.
6. Demonstrate the hosted website.
When a hosting provider allocates space on a web server for a website to store its files, they are hosting a website. Web hosting makes the files that comprise a website (code, images, etc.) available for viewing online. Every website you’ve ever visited is hosted on a server.
The amount of space allocated on a server to a website depends on the type of hosting. The main types of hosting are shared, dedicated, VPS and reseller. They are differentiated by the kind of technology used for the server, the level of management provided and the additional services on offer.
7. What are the key factors to keep in mind during the process?
Vpc,Ec2,Security Group,Vpc,Rds,Mysql,Java
8. Clean up the project environment and avoid future costs.
