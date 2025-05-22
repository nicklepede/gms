package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.settings.component.PhotosPackageReplacedIntentOperation;
import defpackage.ajwt;
import defpackage.ajye;
import defpackage.ajyg;
import defpackage.akai;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akaw;
import defpackage.akax;
import defpackage.auad;
import defpackage.aupv;
import defpackage.dyla;
import defpackage.dylb;
import defpackage.dymk;
import defpackage.dyml;
import defpackage.dymt;
import defpackage.dymu;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fwpk;
import defpackage.fwsz;
import defpackage.fwtb;
import defpackage.fwtc;
import defpackage.fwue;
import defpackage.fxnl;
import defpackage.fxnm;
import defpackage.fxnz;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhotosPackageReplacedIntentOperation extends IntentOperation {
    private final auad a = ajwt.a("PhotosPackageReplacedIO");
    private final ekww b = ekxd.a(new ekww() { // from class: almw
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().u());
        }
    });
    private final ekww c = ekxd.a(new ekww() { // from class: almx
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().q());
        }
    });
    private final ekww d = ekxd.a(new ekww() { // from class: almy
        @Override // defpackage.ekww
        public final Object lK() {
            return Long.valueOf(fofq.a.lK().d());
        }
    });
    private ekww e;
    private ekww f;
    private ekww g;

    public final akax a(akar akarVar) {
        akax b = ((ajyg) this.e.lK()).b(akarVar);
        this.a.h("Call get backup status from Photos to trigger bit migration if migration condition is met, backupStatus=%s.", b);
        return b;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.e = new ekww() { // from class: almz
            @Override // defpackage.ekww
            public final Object lK() {
                return ajyg.a(PhotosPackageReplacedIntentOperation.this);
            }
        };
        this.f = new ekww() { // from class: alna
            @Override // defpackage.ekww
            public final Object lK() {
                return ajye.b(PhotosPackageReplacedIntentOperation.this);
            }
        };
        this.g = new ekww() { // from class: alnb
            @Override // defpackage.ekww
            public final Object lK() {
                return ajyd.a(PhotosPackageReplacedIntentOperation.this.getPackageManager());
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        fwtc fwtcVar;
        if (!((Boolean) this.b.lK()).booleanValue()) {
            this.a.j("Flag is disabled.", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        String action = intent.getAction();
        if (data == null || action == null || !data.getSchemeSpecificPart().equals("com.google.android.apps.photos") || !action.equals("android.intent.action.PACKAGE_REPLACED")) {
            return;
        }
        akaq a = akar.a();
        a.c(5);
        final akar a2 = a.a();
        if (((dylb) this.g.lK()).c() != dyla.STUB_APK) {
            if (a(a2).a.equals(akaw.ERROR)) {
                aupv aupvVar = new aupv(1, 10);
                Callable callable = new Callable() { // from class: almv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PhotosPackageReplacedIntentOperation.this.a(a2);
                    }
                };
                ekww ekwwVar = this.d;
                this.a.h("Scheduled get backup status task since last attempt is failed, task will run in milliseconds=%s, future=%s", ekwwVar.lK(), aupvVar.schedule(callable, ((Long) ekwwVar.lK()).longValue(), TimeUnit.MILLISECONDS));
                return;
            }
            return;
        }
        if (!((Boolean) this.c.lK()).booleanValue()) {
            this.a.h("Clear backup settings in Restore flag is disabled.", new Object[0]);
            return;
        }
        akai akaiVar = (akai) ((ajye) this.f.lK()).a.j.lK();
        Long a3 = akaiVar.b.a();
        try {
            dymt dymtVar = (dymt) akaiVar.a.lK();
            dymk dymkVar = dymk.a;
            fgrc v = dymkVar.v();
            if (!v.b.L()) {
                v.U();
            }
            dymk dymkVar2 = (dymk) v.b;
            dymkVar2.c = 1;
            dymkVar2.b |= 1;
            dymk dymkVar3 = (dymk) v.Q();
            fwpk fwpkVar = dymtVar.a;
            fwtc fwtcVar2 = dymu.d;
            if (fwtcVar2 == null) {
                synchronized (dymu.class) {
                    fwtc fwtcVar3 = dymu.d;
                    if (fwtcVar3 == null) {
                        fwsz a4 = fwtc.a();
                        a4.c = fwtb.UNARY;
                        a4.d = fwtc.c("com.google.android.libraries.restore.backup.photos.apiservice.PhotosBackupApiService", "ClearOptInBackupSettings");
                        a4.b();
                        fgqp fgqpVar = fxnm.a;
                        a4.a = new fxnl(dymkVar);
                        a4.b = new fxnl(dyml.a);
                        fwtcVar = a4.a();
                        dymu.d = fwtcVar;
                    } else {
                        fwtcVar = fwtcVar3;
                    }
                }
                fwtcVar2 = fwtcVar;
            }
            fxnz.a(fwpkVar.a(fwtcVar2, dymtVar.b), dymkVar3);
            akaiVar.b.g(16, a2, true, a3);
            z = true;
        } catch (fwue unused) {
            akaiVar.b.f(16, a2, 5, a3);
            z = false;
        }
        this.a.h("Call clearTempBackupSettingsInRestore result, %s.", Boolean.valueOf(z));
    }
}
