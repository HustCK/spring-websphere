FROM websphere-liberty:kernel

COPY --chown=1001:0 target/*.war /config/dropins/spring/
COPY --chown=1001:0 src/main/liberty/config/server.xml /config/

RUN configure.sh