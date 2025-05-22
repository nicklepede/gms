package com.google.android.gms.location.provider.network;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import defpackage.asxd;
import defpackage.aupz;
import defpackage.aury;
import defpackage.auti;
import defpackage.ccrn;
import defpackage.ccsu;
import defpackage.ccsz;
import defpackage.cctg;
import defpackage.itk;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NetworkLocationChimeraService extends Service {
    private ccrn a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ccrn ccrnVar = this.a;
        if (ccrnVar != null) {
            ((ccsz) ((cctg) ccrnVar).c.a).f(new auti(printWriter, "  "));
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        int i = asxd.c;
        if (aury.c(this)) {
            return null;
        }
        if (this.a == null) {
            try {
                Context context = (Context) Objects.requireNonNull(ModuleManager.createSubmoduleContext(this, "network_location_provider"));
                int i2 = ccsu.a;
                final cctg cctgVar = new cctg(context);
                this.a = cctgVar;
                cctg cctgVar2 = cctgVar;
                cctg cctgVar3 = cctgVar;
                cctgVar.c.f(new aupz(1, 9), new itk() { // from class: cctc
                    @Override // defpackage.itk
                    public final void a(Object obj) {
                        ((ccsz) obj).h(cctg.this);
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
            ((cctg) ccrnVar).c.e(new itk() { // from class: ccta
                @Override // defpackage.itk
                public final void a(Object obj) {
                    ((ccsz) obj).k();
                }
            });
            this.a = null;
        }
        super.onDestroy();
    }
}
