require recipes-images/angstrom/console-image.bb

PV = '1.0'
PR = 'r0'

DEPENDS += "bash perl gcc i2c-tools"

IMAGE_INSTALL += " \
	kernel-image \
	kernel-modules \
	kernel-dev \
	linux-firmware \
	vim vim-vimrc \
	gcc \
	gdb gdbserver \
	lighttpd \
	lighttpd-module-cgi \
	bash gcc i2c-tools ethtool \
	packagegroup-sdk-target \
	ne10 \
	ne10-dev \
	vim \
	curl \
	e2fsprogs \
	python-multiprocessing \
	python-compiler \
	python-misc \
	packagegroup-tools-bluetooth \
	de10-nano-adxl-apps \
	de10-nano-lighttpd-conf \
	de10-nano-webcontent \
	de10-nano-gpio-apps \
	de10-nano-fpga-init \
	de10-nano-fpga-leds \
	de10-nano-usb-gadget \
	de10-nano-linux-firmware \
	de10-nano-fftsw-apps \
	de10-nano-fftdriver-mod \
	"

export IMAGE_BASENAME = "de10-nano-image"

