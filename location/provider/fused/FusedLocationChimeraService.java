package com.google.android.gms.location.provider.fused;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import defpackage.aupz;
import defpackage.auti;
import defpackage.ccrn;
import defpackage.ccro;
import defpackage.ccrt;
import defpackage.ccry;
import defpackage.itk;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FusedLocationChimeraService extends Service {
    private ccrn a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ccrn ccrnVar = this.a;
        if (ccrnVar != null) {
            ((ccrt) ((ccry) ccrnVar).b.a).a(new auti(printWriter, "  "));
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            try {
                Context context = (Context) Objects.requireNonNull(ModuleManager.createSubmoduleContext(this, "fused_location_provider"));
                int i = ccro.a;
                final ccry ccryVar = new ccry(context);
                this.a = ccryVar;
                ccry ccryVar2 = ccryVar;
                ccry ccryVar3 = ccryVar;
                ccryVar.b.f(new aupz(1, 9), new itk() { // from class: ccrv
                    @Override // defpackage.itk
                    public final void a(Object obj) {
                        ((ccrt) obj).b(ccry.this);
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
        ccrn ccrnVar = this.a;
        if (ccrnVar != null) {
            ((ccry) ccrnVar).b.e(new itk() { // from class: ccru
                @Override // defpackage.itk
                public final void a(Object obj) {
                    ((ccrt) obj).e();
                }
            });
            this.a = null;
        }
        super.onDestroy();
    }
}
