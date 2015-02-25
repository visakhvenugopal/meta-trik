SUMMARY = "Multimedia libraries package"
DESCRIPTION = "Multimedia libraries and utilities"
LICENSE = "LGPL"
PR = "r2"

inherit packagegroup

RDEPENDS_${PN} = "\
  vlc \
  alsa-utils \
  espeak \
  flite-alsa \
  rhvoice\
  v4l-utils \
  gst-meta-base \
  gst-meta-audio \
  gst-meta-video \
  gst-ffmpeg \
  sox \
  mjpg-streamer \
 "

RRECOMMENDS_${PN} = "\
 "

