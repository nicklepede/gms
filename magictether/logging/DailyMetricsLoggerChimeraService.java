package com.google.android.gms.magictether.logging;

import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.cdyn;
import defpackage.cdyo;
import defpackage.cebs;
import defpackage.cebt;
import defpackage.ceet;
import defpackage.eluo;
import defpackage.fssz;
import defpackage.fstc;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DailyMetricsLoggerChimeraService extends GmsTaskChimeraService {
    private static final ausn a = cebs.a("DailyMetricsLogger");

    public static boolean d() {
        return fstc.e() && fssz.e() && fssz.f();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!d()) {
            ((eluo) ((eluo) a.j()).ai((char) 6224)).x("Failed to log daily metrics.");
            casd.a(this).d("DailyMetricsLogger", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService");
            return 2;
        }
        cebt cebtVar = new cebt();
        if (fstc.e()) {
            long b = new cdyo(AppContextProvider.a(), (short[]) null).b("KEY_LAST_ACTIVE_TIMESTAMP", -1L);
            if (b > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, -28);
                if (b >= calendar.getTimeInMillis()) {
                    cebtVar.c("magictether_active_hosts_28DA", false);
                }
                calendar.add(6, 14);
                if (b >= calendar.getTimeInMillis()) {
                    cebtVar.c("magictether_active_hosts_14DA", false);
                }
                calendar.add(6, 7);
                if (b >= calendar.getTimeInMillis()) {
                    cebtVar.c("magictether_active_hosts_7DA", false);
                }
                calendar.add(6, 6);
                if (b >= calendar.getTimeInMillis()) {
                    cebtVar.c("magictether_active_hosts_1DA", false);
                }
            }
            cebtVar.v("magictether_active_users_1DA", "magictether_active_users_7DA", "magictether_active_users_28DA", new cdyo(AppContextProvider.a(), (short[]) null).b("KEY_CLIENT_LAST_ACTIVE_TIMESTAMP", -1L));
            cebtVar.v("magictether_active_devices_1DA", "magictether_active_devices_7DA", "magictether_active_devices_28DA", new cdyo(AppContextProvider.a(), (short[]) null).b("KEY_DEVICE_LAST_ACTIVE_TIMESTAMP", -1L));
            cebtVar.v("magictether_eligible_devices_1DA", "magictether_eligible_devices_7DA", "magictether_eligible_devices_28DA", new cdyo(AppContextProvider.a(), (short[]) null).b("KEY_DEVICE_LAST_ELIGIBLE_TIMESTAMP", -1L));
            cebtVar.e("host_status", new cdyo(AppContextProvider.a(), (short[]) null).a("KEY_HOST_STATUS", 0), false);
            if (cdyn.b()) {
                cebtVar.v("magictether_active_wifi_client_users_1DA", "magictether_active_wifi_client_users_7DA", "magictether_active_wifi_client_users_28DA", new cdyo(AppContextProvider.a(), (short[]) null).b("KEY_WIFI_CLIENT_LAST_ACTIVE_TIMESTAMP", -1L));
                if (new cdyo(AppContextProvider.a(), (short[]) null).k("KEY_WIFI_HAS_CONNECTED_AT_LEAST_ONCE", false)) {
                    cebtVar.d("magictether_instant_wifi_client_state", 2);
                } else if (ceet.c()) {
                    cebtVar.d("magictether_instant_wifi_client_state", 1);
                } else {
                    cebtVar.d("magictether_instant_wifi_client_state", 0);
                }
            }
            cebtVar.f();
        }
        return 0;
    }
}
