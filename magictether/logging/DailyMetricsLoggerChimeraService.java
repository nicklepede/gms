package com.google.android.gms.magictether.logging;

import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.cbpv;
import defpackage.cbpw;
import defpackage.cbta;
import defpackage.cbtb;
import defpackage.cbwb;
import defpackage.ejhf;
import defpackage.fpzd;
import defpackage.fpzg;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DailyMetricsLoggerChimeraService extends GmsTaskChimeraService {
    private static final asot a = cbta.a("DailyMetricsLogger");

    public static boolean d() {
        return fpzg.f() && fpzd.e() && fpzd.f();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!d()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 6205)).x("Failed to log daily metrics.");
            byjl.a(this).d("DailyMetricsLogger", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService");
            return 2;
        }
        cbtb cbtbVar = new cbtb();
        if (fpzg.f()) {
            long b = new cbpw(AppContextProvider.a(), (short[]) null).b("KEY_LAST_ACTIVE_TIMESTAMP", -1L);
            if (b > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, -28);
                if (b >= calendar.getTimeInMillis()) {
                    cbtbVar.c("magictether_active_hosts_28DA", false);
                }
                calendar.add(6, 14);
                if (b >= calendar.getTimeInMillis()) {
                    cbtbVar.c("magictether_active_hosts_14DA", false);
                }
                calendar.add(6, 7);
                if (b >= calendar.getTimeInMillis()) {
                    cbtbVar.c("magictether_active_hosts_7DA", false);
                }
                calendar.add(6, 6);
                if (b >= calendar.getTimeInMillis()) {
                    cbtbVar.c("magictether_active_hosts_1DA", false);
                }
            }
            cbtbVar.v("magictether_active_users_1DA", "magictether_active_users_7DA", "magictether_active_users_28DA", new cbpw(AppContextProvider.a(), (short[]) null).b("KEY_CLIENT_LAST_ACTIVE_TIMESTAMP", -1L));
            cbtbVar.v("magictether_active_devices_1DA", "magictether_active_devices_7DA", "magictether_active_devices_28DA", new cbpw(AppContextProvider.a(), (short[]) null).b("KEY_DEVICE_LAST_ACTIVE_TIMESTAMP", -1L));
            cbtbVar.v("magictether_eligible_devices_1DA", "magictether_eligible_devices_7DA", "magictether_eligible_devices_28DA", new cbpw(AppContextProvider.a(), (short[]) null).b("KEY_DEVICE_LAST_ELIGIBLE_TIMESTAMP", -1L));
            cbtbVar.e("host_status", new cbpw(AppContextProvider.a(), (short[]) null).a("KEY_HOST_STATUS", 0), false);
            if (cbpv.b()) {
                cbtbVar.v("magictether_active_wifi_client_users_1DA", "magictether_active_wifi_client_users_7DA", "magictether_active_wifi_client_users_28DA", new cbpw(AppContextProvider.a(), (short[]) null).b("KEY_WIFI_CLIENT_LAST_ACTIVE_TIMESTAMP", -1L));
                if (new cbpw(AppContextProvider.a(), (short[]) null).k("KEY_WIFI_HAS_CONNECTED_AT_LEAST_ONCE", false)) {
                    cbtbVar.d("magictether_instant_wifi_client_state", 2);
                } else if (cbwb.c()) {
                    cbtbVar.d("magictether_instant_wifi_client_state", 1);
                } else {
                    cbtbVar.d("magictether_instant_wifi_client_state", 0);
                }
            }
            cbtbVar.f();
        }
        return 0;
    }
}
