package com.google.android.gms.location.provider.fused;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import defpackage.asmf;
import defpackage.aspo;
import defpackage.caix;
import defpackage.caiy;
import defpackage.cajd;
import defpackage.caji;
import defpackage.iru;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FusedLocationChimeraService extends Service {
    private caix a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        caix caixVar = this.a;
        if (caixVar != null) {
            ((cajd) ((caji) caixVar).b.a).a(new aspo(printWriter, "  "));
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            try {
                Context context = (Context) Objects.requireNonNull(ModuleManager.createSubmoduleContext(this, "fused_location_provider"));
                int i = caiy.a;
                final caji cajiVar = new caji(context);
                this.a = cajiVar;
                caji cajiVar2 = cajiVar;
                caji cajiVar3 = cajiVar;
                cajiVar.b.f(new asmf(1, 9), new iru() { // from class: cajf
                    @Override // defpackage.iru
                    public final void a(Object obj) {
                        ((cajd) obj).b(caji.this);
                    }
                });
            } catch (NoClassDefFoundError unused) {
                return null;
            }
        }
        return this.a.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        caix caixVar = this.a;
        if (caixVar != null) {
            ((caji) caixVar).b.e(new iru() { // from class: caje
                @Override // defpackage.iru
                public final void a(Object obj) {
                    ((cajd) obj).e();
                }
            });
            this.a = null;
        }
        super.onDestroy();
    }
}
