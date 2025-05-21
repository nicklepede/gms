package com.google.android.gms.location.provider.network;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import defpackage.aquo;
import defpackage.asmf;
import defpackage.asoe;
import defpackage.aspo;
import defpackage.caix;
import defpackage.cake;
import defpackage.cakj;
import defpackage.cakq;
import defpackage.iru;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NetworkLocationChimeraService extends Service {
    private caix a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        caix caixVar = this.a;
        if (caixVar != null) {
            ((cakj) ((cakq) caixVar).c.a).f(new aspo(printWriter, "  "));
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        int i = aquo.c;
        if (asoe.c(this)) {
            return null;
        }
        if (this.a == null) {
            try {
                Context context = (Context) Objects.requireNonNull(ModuleManager.createSubmoduleContext(this, "network_location_provider"));
                int i2 = cake.a;
                final cakq cakqVar = new cakq(context);
                this.a = cakqVar;
                cakq cakqVar2 = cakqVar;
                cakq cakqVar3 = cakqVar;
                cakqVar.c.f(new asmf(1, 9), new iru() { // from class: cakm
                    @Override // defpackage.iru
                    public final void a(Object obj) {
                        ((cakj) obj).h(cakq.this);
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
            ((cakq) caixVar).c.e(new iru() { // from class: cakk
                @Override // defpackage.iru
                public final void a(Object obj) {
                    ((cakj) obj).k();
                }
            });
            this.a = null;
        }
        super.onDestroy();
    }
}
