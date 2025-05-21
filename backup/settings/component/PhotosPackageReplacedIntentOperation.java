package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.settings.component.PhotosPackageReplacedIntentOperation;
import defpackage.ahwd;
import defpackage.ahxo;
import defpackage.ahxq;
import defpackage.ahzs;
import defpackage.aiaa;
import defpackage.aiab;
import defpackage.aiag;
import defpackage.aiah;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.dvyz;
import defpackage.dvza;
import defpackage.dwaj;
import defpackage.dwak;
import defpackage.dwas;
import defpackage.dwat;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fttm;
import defpackage.ftxb;
import defpackage.ftxd;
import defpackage.ftxe;
import defpackage.ftyg;
import defpackage.furn;
import defpackage.furo;
import defpackage.fusb;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhotosPackageReplacedIntentOperation extends IntentOperation {
    private final arxo a = ahwd.a("PhotosPackageReplacedIO");
    private final eijr b = eijy.a(new eijr() { // from class: ajme
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().u());
        }
    });
    private final eijr c = eijy.a(new eijr() { // from class: ajmf
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().q());
        }
    });
    private final eijr d = eijy.a(new eijr() { // from class: ajmg
        @Override // defpackage.eijr
        public final Object a() {
            return Long.valueOf(flog.a.a().d());
        }
    });
    private eijr e;
    private eijr f;
    private eijr g;

    public final aiah a(aiab aiabVar) {
        aiah b = ((ahxq) this.e.a()).b(aiabVar);
        this.a.h("Call get backup status from Photos to trigger bit migration if migration condition is met, backupStatus=%s.", b);
        return b;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.e = new eijr() { // from class: ajmh
            @Override // defpackage.eijr
            public final Object a() {
                return ahxq.a(PhotosPackageReplacedIntentOperation.this);
            }
        };
        this.f = new eijr() { // from class: ajmi
            @Override // defpackage.eijr
            public final Object a() {
                return ahxo.b(PhotosPackageReplacedIntentOperation.this);
            }
        };
        this.g = new eijr() { // from class: ajmj
            @Override // defpackage.eijr
            public final Object a() {
                return ahxn.a(PhotosPackageReplacedIntentOperation.this.getPackageManager());
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        ftxe ftxeVar;
        if (!((Boolean) this.b.a()).booleanValue()) {
            this.a.j("Flag is disabled.", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        String action = intent.getAction();
        if (data == null || action == null || !data.getSchemeSpecificPart().equals("com.google.android.apps.photos") || !action.equals("android.intent.action.PACKAGE_REPLACED")) {
            return;
        }
        aiaa a = aiab.a();
        a.c(5);
        final aiab a2 = a.a();
        if (((dvza) this.g.a()).c() != dvyz.STUB_APK) {
            if (a(a2).a.equals(aiag.ERROR)) {
                asmb asmbVar = new asmb(1, 10);
                Callable callable = new Callable() { // from class: ajmd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PhotosPackageReplacedIntentOperation.this.a(a2);
                    }
                };
                eijr eijrVar = this.d;
                this.a.h("Scheduled get backup status task since last attempt is failed, task will run in milliseconds=%s, future=%s", eijrVar.a(), asmbVar.schedule(callable, ((Long) eijrVar.a()).longValue(), TimeUnit.MILLISECONDS));
                return;
            }
            return;
        }
        if (!((Boolean) this.c.a()).booleanValue()) {
            this.a.h("Clear backup settings in Restore flag is disabled.", new Object[0]);
            return;
        }
        ahzs ahzsVar = (ahzs) ((ahxo) this.f.a()).a.j.a();
        Long a3 = ahzsVar.b.a();
        try {
            dwas dwasVar = (dwas) ahzsVar.a.a();
            dwaj dwajVar = dwaj.a;
            fecj v = dwajVar.v();
            if (!v.b.L()) {
                v.U();
            }
            dwaj dwajVar2 = (dwaj) v.b;
            dwajVar2.c = 1;
            dwajVar2.b |= 1;
            dwaj dwajVar3 = (dwaj) v.Q();
            fttm fttmVar = dwasVar.a;
            ftxe ftxeVar2 = dwat.d;
            if (ftxeVar2 == null) {
                synchronized (dwat.class) {
                    ftxe ftxeVar3 = dwat.d;
                    if (ftxeVar3 == null) {
                        ftxb a4 = ftxe.a();
                        a4.c = ftxd.UNARY;
                        a4.d = ftxe.c("com.google.android.libraries.restore.backup.photos.apiservice.PhotosBackupApiService", "ClearOptInBackupSettings");
                        a4.b();
                        febw febwVar = furo.a;
                        a4.a = new furn(dwajVar);
                        a4.b = new furn(dwak.a);
                        ftxeVar = a4.a();
                        dwat.d = ftxeVar;
                    } else {
                        ftxeVar = ftxeVar3;
                    }
                }
                ftxeVar2 = ftxeVar;
            }
            fusb.a(fttmVar.a(ftxeVar2, dwasVar.b), dwajVar3);
            ahzsVar.b.g(16, a2, true, a3);
            z = true;
        } catch (ftyg unused) {
            ahzsVar.b.f(16, a2, 5, a3);
            z = false;
        }
        this.a.h("Call clearTempBackupSettingsInRestore result, %s.", Boolean.valueOf(z));
    }
}
