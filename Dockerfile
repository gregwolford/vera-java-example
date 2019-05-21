FROM centos:7

LABEL maintainer "mbrown@veracode.com"

RUN yum -y update && \
yum -y install httpd && \
yum clean all

