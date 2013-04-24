#include <stdio.h>
#include <unistd.h>
#include <systemd/sd-daemon.h>

int main(int argc, char ** argv)
{
	printf("systemd watchdog test\n");
	sd_notify(0, "READY=1\n"
		     "STATUS=main loop running...\n");

	while(1) {
		sleep(1);
		printf("kick dog\n");
		sd_notify(0, "WATCHDOG=1");
	}
}

