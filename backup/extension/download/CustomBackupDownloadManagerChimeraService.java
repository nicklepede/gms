package com.google.android.gms.backup.extension.download;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.R;
import com.google.android.setupcompat.portal.ProgressServiceComponent;
import defpackage.ahwd;
import defpackage.aieq;
import defpackage.aixm;
import defpackage.aixp;
import defpackage.aixt;
import defpackage.aixu;
import defpackage.aixx;
import defpackage.aiym;
import defpackage.aiyn;
import defpackage.aiyy;
import defpackage.aiza;
import defpackage.aizb;
import defpackage.ajae;
import defpackage.arwm;
import defpackage.aslt;
import defpackage.asmf;
import defpackage.dfee;
import defpackage.edet;
import defpackage.edfc;
import defpackage.edfe;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ensv;
import defpackage.fllt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadManagerChimeraService extends aslt {
    public static final ahwd a = new ahwd("CustomBackupDownloadService");
    public static boolean b = false;
    public String e;
    public aixx f;
    public aixu g;
    public aixp h;
    public edet j;
    private aizb k;
    private aiyn l;
    public final Object c = new Object();
    public final ensv d = new asmf(1, 9);
    public final eijr i = eijy.a(new eijr() { // from class: aixq
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fllt.t());
        }
    });
    private final eijr m = eijy.a(new eijr() { // from class: aixr
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flly.f());
        }
    });

    public static void d(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.google.android.gms.backup.extension.download.CustomBackupDataDownloadManagerService");
        context.startService(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108 A[Catch: all -> 0x00e7, TryCatch #2 {all -> 0x00e7, blocks: (B:24:0x00ae, B:27:0x00bb, B:30:0x00c7, B:33:0x00cb, B:36:0x00d0, B:38:0x00d6, B:39:0x0100, B:41:0x0108, B:42:0x011d, B:58:0x011f, B:59:0x0129, B:60:0x00e2, B:63:0x00f2), top: B:23:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[Catch: all -> 0x00e7, TryCatch #2 {all -> 0x00e7, blocks: (B:24:0x00ae, B:27:0x00bb, B:30:0x00c7, B:33:0x00cb, B:36:0x00d0, B:38:0x00d6, B:39:0x0100, B:41:0x0108, B:42:0x011d, B:58:0x011f, B:59:0x0129, B:60:0x00e2, B:63:0x00f2), top: B:23:0x00ae }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService.a():void");
    }

    @Override // defpackage.aslt
    protected final void b(Intent intent) {
        aixm aixmVar = new aixm(this);
        aixp aixpVar = this.h;
        eiig.x(aixpVar);
        aizb aizbVar = new aizb(aixpVar);
        this.k = aizbVar;
        ahwd ahwdVar = aizb.a;
        ahwdVar.d("Should integrate called", new Object[0]);
        if (!((Boolean) aizbVar.b.a()).booleanValue()) {
            ahwdVar.d("Portal integration flag is disabled", new Object[0]);
        } else if (checkSelfPermission("com.google.android.setupwizard.SETUP_PROGRESS_SERVICE") != 0) {
            ahwdVar.d("Portal integration permission (%s) is not granted", "com.google.android.setupwizard.SETUP_PROGRESS_SERVICE");
        } else if (aizbVar.a(this)) {
            ahwdVar.d("Integration with portal allowed. Flag: true, Permission: granted", new Object[0]);
            if (aixmVar.j()) {
                this.h.e(2);
                long d = fllt.a.a().d();
                Intent c = aieq.c();
                aizb aizbVar2 = this.k;
                try {
                    ProgressServiceComponent a2 = edfe.a(getPackageName(), "BbG1Portal", false, false, d, R.string.backup_extension_download_ongoing_screen_title, 2131232825, new Intent().setClassName(getPackageName(), "com.google.android.gms.backup.extension.download.CustomBackupDataDownloadManagerService"), c);
                    ahwdVar.d("Registering %s to Portal", getClass().getName());
                    aiyy aiyyVar = aizbVar2.d;
                    edfc.a(this, a2, new aiza(aizbVar2, this));
                    return;
                } catch (RuntimeException e) {
                    aizb.a.i("Exception raised in portal registration: starting download with notification %s", e, new Object[0]);
                    aizbVar2.c(4);
                    c();
                    return;
                }
            }
        } else {
            ahwdVar.d("Consent notification displayed or Portal failed already. Cannot use Portal", new Object[0]);
        }
        a.d("Not eligible for portal.", new Object[0]);
        this.h.e(3);
        c();
    }

    protected final void c() {
        aixm aixmVar = new aixm(this);
        int a2 = ((Boolean) this.m.a()).booleanValue() ? dfee.BACKUP_CUSTOM_RESTORE_NOTIFICATIONS.a() : 5;
        ahwd ahwdVar = a;
        ahwdVar.d("Foregrounding service with notification and downloading. Notification id %s", Integer.valueOf(a2));
        aiyn aiynVar = this.l;
        eiig.x(aiynVar);
        Integer num = (Integer) aiynVar.c.get(aiym.IN_PROGRESS);
        arwm.s(num);
        int intValue = num.intValue();
        Context context = aiynVar.a;
        String string = context.getString(intValue);
        Notification.Builder builder = aiynVar.b;
        builder.setContentTitle(string);
        builder.setContentText(context.getString(R.string.backup_extension_restore_default_notification_text));
        builder.setOngoing(true);
        startForeground(a2, builder.build());
        aixp aixpVar = this.h;
        if (aixpVar != null) {
            aixpVar.c(3);
        }
        a();
        if (aixmVar.j()) {
            aiyn aiynVar2 = this.l;
            eiig.x(aiynVar2);
            aiynVar2.a(aiym.FAILURE);
            ahwdVar.d("Posting failure notification", new Object[0]);
        } else {
            aiyn aiynVar3 = this.l;
            eiig.x(aiynVar3);
            aiynVar3.a(aiym.DONE);
            ahwdVar.d("Posting done notification", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(2);
        } else {
            stopForeground(false);
        }
    }

    @Override // defpackage.aslt, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (((Boolean) this.i.a()).booleanValue() && edfc.c(intent)) {
            a.d("#onBind: Returning SetupWizardPortalBinder", new Object[0]);
            return new aixt(this);
        }
        a.d("#onBind: Returning CustomBackupDownloadManagerServiceBinder", new Object[0]);
        return new ajae(this);
    }

    @Override // defpackage.aslt, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.l = new aiyn(this);
        this.h = new aixp();
        this.g = new aixu(this, this.h);
    }

    @Override // defpackage.aslt, com.google.android.chimera.Service
    public final void onDestroy() {
        aixm aixmVar = new aixm(this);
        if (aixmVar.j()) {
            a.d("Reschedule the CustomBackupDownloadStarterTask task as there is more data for download: %s", aixmVar.c());
            CustomBackupDownloadStarterTask.d(this);
        }
        this.h.a(ekhl.a, ekhk.CUSTOM_BACKUP_DOWNLOAD_SERVICE_DESTROYED_EVENT);
        super.onDestroy();
    }
}
