# Use the appropriate base image for Windows
FROM mcr.microsoft.com/windows/servercore:ltsc2019

SHELL ["powershell", "-Command", "$ErrorActionPreference = 'Stop'; $ProgressPreference = 'SilentlyContinue';"]

# Download Nginx and install it
RUN Invoke-WebRequest -OutFile nginx.zip -UseBasicParsing "http://nginx.org/download/nginx-1.21.3.zip" ; \
    Expand-Archive nginx.zip -DestinationPath C:\ ; \
    Remove-Item -Force nginx.zip ; \
    Move-Item -Path C:/nginx-1.21.3 -Destination C:/nginx

# Copy the Nginx configuration file
COPY default C:/nginx/conf/

# Expose the port for external access
EXPOSE 80

# Start the Nginx server as the main process
CMD ["C:/nginx/nginx.exe", "-g", "daemon off;"]