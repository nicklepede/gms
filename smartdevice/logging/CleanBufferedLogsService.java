package com.google.android.gms.smartdevice.logging;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.dcve;
import defpackage.dcyf;
import defpackage.ddta;
import defpackage.denq;
import defpackage.dxob;
import defpackage.edkl;
import defpackage.fnck;
import defpackage.fsdg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CleanBufferedLogsService extends GmsTaskBoundService {
    private static final arxo a = new denq(new String[]{"CleanBufferedLogsService"});
    private edkl b;
    private dcve c;

    public static void d(Context context) {
        byjl a2 = byjl.a(context);
        long a3 = g() ? 300000L : fsdg.a.a().a();
        long b = g() ? 300000L : fsdg.a.a().b();
        bykj bykjVar = new bykj();
        bykjVar.e(TimeUnit.MILLISECONDS.toSeconds(a3), TimeUnit.MILLISECONDS.toSeconds(b + a3));
        bykjVar.t("upload_buffered_logs_one_off");
        bykjVar.w(CleanBufferedLogsService.class.getName());
        bykjVar.x(0, 0);
        bykjVar.g(2);
        a2.f(bykjVar.b());
        a.h("One off task %s scheduled!", "upload_buffered_logs_one_off");
    }

    public static void e(Context context) {
        byjl a2 = byjl.a(context);
        if (fnck.a.a().j()) {
            byko bykoVar = new byko();
            bykoVar.w(CleanBufferedLogsService.class.getName());
            bykoVar.t("upload_buffered_logs_periodic");
            bykoVar.a = bykv.j;
            bykoVar.l(true);
            bykoVar.v(2);
            bykoVar.k();
            a2.f(bykoVar.b());
        } else {
            bykm bykmVar = new bykm();
            bykmVar.w(CleanBufferedLogsService.class.getName());
            bykmVar.t("upload_buffered_logs_periodic");
            bykmVar.j(byki.EVERY_DAY);
            bykmVar.p = true;
            bykmVar.x(0, 1);
            bykmVar.v(0);
            bykmVar.g(1);
            a2.f(bykmVar.b());
        }
        a.h("Periodic task %s scheduled!", "upload_buffered_logs_periodic");
    }

    private final synchronized void f(ddta ddtaVar, String str, String str2) {
        String str3;
        try {
            Integer num = (Integer) ddtaVar.a(this.b, str).get(20L, TimeUnit.SECONDS);
            int intValue = num.intValue();
            if ("upload_buffered_logs_periodic".equals(str2)) {
                dcve dcveVar = this.c;
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
                ((dxob) dcveVar.f.a()).b(str, str3);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.f("Failed to upload and cleanup buffered %s logs: %s: %s", str, e.getClass().getSimpleName(), String.valueOf(e.getMessage()));
        }
    }

    private static boolean g() {
        return Build.TYPE.equals("userdebug");
    }

    private final void h(String str) {
        ddta ddtaVar = new ddta(getApplicationContext(), this.c);
        f(ddtaVar, "SMART_SETUP", str);
        f(ddtaVar, "ANDROID_AUTH", str);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        if (!fsdg.c()) {
            a.d("Skipping task %s because flag is not set", bylnVar.a);
            return 0;
        }
        String str = bylnVar.a;
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
    public final void fR() {
        a.d("onInitializeTasks", new Object[0]);
        e(this);
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        edkl a2 = edkl.a(getApplicationContext());
        dcve a3 = dcyf.a(getApplicationContext());
        this.b = a2;
        this.c = a3;
    }
}
