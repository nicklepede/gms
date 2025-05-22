package com.google.android.gms.smartdevice.logging;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auad;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.dfgj;
import defpackage.dfjk;
import defpackage.dgef;
import defpackage.dgyt;
import defpackage.eaab;
import defpackage.efxh;
import defpackage.fpuj;
import defpackage.fuyd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CleanBufferedLogsService extends GmsTaskBoundService {
    private static final auad a = new dgyt(new String[]{"CleanBufferedLogsService"});
    private efxh b;
    private dfgj c;

    public static void d(Context context) {
        casd a2 = casd.a(context);
        long a3 = g() ? 300000L : fuyd.a.lK().a();
        long b = g() ? 300000L : fuyd.a.lK().b();
        catb catbVar = new catb();
        catbVar.e(TimeUnit.MILLISECONDS.toSeconds(a3), TimeUnit.MILLISECONDS.toSeconds(b + a3));
        catbVar.t("upload_buffered_logs_one_off");
        catbVar.w(CleanBufferedLogsService.class.getName());
        catbVar.x(0, 0);
        catbVar.g(2);
        a2.f(catbVar.b());
        a.h("One off task %s scheduled!", "upload_buffered_logs_one_off");
    }

    public static void e(Context context) {
        casd a2 = casd.a(context);
        if (fpuj.a.lK().j()) {
            catg catgVar = new catg();
            catgVar.w(CleanBufferedLogsService.class.getName());
            catgVar.t("upload_buffered_logs_periodic");
            catgVar.a = catn.j;
            catgVar.l(true);
            catgVar.v(2);
            catgVar.k();
            a2.f(catgVar.b());
        } else {
            cate cateVar = new cate();
            cateVar.w(CleanBufferedLogsService.class.getName());
            cateVar.t("upload_buffered_logs_periodic");
            cateVar.j(cata.EVERY_DAY);
            cateVar.p = true;
            cateVar.x(0, 1);
            cateVar.v(0);
            cateVar.g(1);
            a2.f(cateVar.b());
        }
        a.h("Periodic task %s scheduled!", "upload_buffered_logs_periodic");
    }

    private final synchronized void f(dgef dgefVar, String str, String str2) {
        String str3;
        try {
            Integer num = (Integer) dgefVar.a(this.b, str).get(20L, TimeUnit.SECONDS);
            int intValue = num.intValue();
            if ("upload_buffered_logs_periodic".equals(str2)) {
                dfgj dfgjVar = this.c;
                if (intValue > 0) {
                    str3 = "SUCCESS";
                } else {
                    if (intValue != -1) {
                        if (intValue != 0) {
                            a.f("Invalid log upload count: %d", num);
                        } else {
                            str3 = "NO_LOGS";
                        }
                    }
                    str3 = "FAILURE";
                }
                ((eaab) dfgjVar.f.lK()).b(str, str3);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.f("Failed to upload and cleanup buffered %s logs: %s: %s", str, e.getClass().getSimpleName(), String.valueOf(e.getMessage()));
        }
    }

    private static boolean g() {
        return Build.TYPE.equals("userdebug");
    }

    private final void h(String str) {
        dgef dgefVar = new dgef(getApplicationContext(), this.c);
        f(dgefVar, "SMART_SETUP", str);
        f(dgefVar, "ANDROID_AUTH", str);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        if (!fuyd.c()) {
            a.d("Skipping task %s because flag is not set", caufVar.a);
            return 0;
        }
        String str = caufVar.a;
        int hashCode = str.hashCode();
        if (hashCode != -511572023) {
            if (hashCode == -104457944 && str.equals("upload_buffered_logs_one_off")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("upload_buffered_logs_periodic")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            a.h("Running task %s", "upload_buffered_logs_periodic");
            h("upload_buffered_logs_periodic");
            return 0;
        }
        if (c != 1) {
            a.m("Received task with unknown tag: %s", str);
            return 2;
        }
        a.h("Running task %s", "upload_buffered_logs_one_off");
        h("upload_buffered_logs_one_off");
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        a.d("onInitializeTasks", new Object[0]);
        e(this);
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        efxh a2 = efxh.a(getApplicationContext());
        dfgj a3 = dfjk.a(getApplicationContext());
        this.b = a2;
        this.c = a3;
    }
}
