DESCRIPTION = "Toolkit library for Sugar"
HOMEPAGE = "http://sugarlabs.org/"
BUGTRACKER = "http://bugs.sugarlabs.org/"

SRC_URI = "http://download.sugarlabs.org/sources/sucrose/glucose/sugar-toolkit-gtk3/sugar-toolkit-gtk3-0.101.0.tar.xz"
SRC_URI[md5sum] = "2ba7376a940f4044354a4d9cef08c491"
SRC_URI[sha256sum] = "ff4424cc87c413502909aafdba11ac84d1180ac3197b97af866069ae52dcfe9c"

DEPENDS = "gtk+"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit autotools
