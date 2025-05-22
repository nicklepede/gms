package com.google.android.gms.auth.api.credentials.credman.remote;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.remote.RemoteProxyChimeraActivity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.aca;
import defpackage.acr;
import defpackage.itk;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yuj;
import defpackage.yuk;
import defpackage.yuv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RemoteProxyChimeraActivity extends rxx {
    public yuk j;
    public aca k;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        yuk yukVar = (yuk) new jxw(this, new yuj(getIntent())).a(yuk.class);
        this.j = yukVar;
        yukVar.e.g(this, new jvs() { // from class: ytv
            @Override // defpackage.jvs
            public final void a(Object obj) {
                RemoteProxyChimeraActivity.this.k.b(new acj((PendingIntent) obj).a());
            }
        });
        this.j.d.g(this, new jvs() { // from class: ytw
            @Override // defpackage.jvs
            public final void a(Object obj) {
                yme ymeVar = (yme) obj;
                int a = ymeVar.a();
                Intent b = ymeVar.b();
                RemoteProxyChimeraActivity remoteProxyChimeraActivity = RemoteProxyChimeraActivity.this;
                remoteProxyChimeraActivity.setResult(a, b);
                remoteProxyChimeraActivity.finish();
            }
        });
        this.k = registerForActivityResult(new acr(), new yuv(new itk() { // from class: ytx
            @Override // defpackage.itk
            public final void a(Object obj) {
                yuk yukVar2 = RemoteProxyChimeraActivity.this.j;
                yukVar2.n = (PublicKeyCredential) obj;
                yukVar2.c.g();
            }
        }, new itk() { // from class: yty
            @Override // defpackage.itk
            public final void a(Object obj) {
                RemoteProxyChimeraActivity.this.j.c.j(((yuu) obj).a);
            }
        }, 28451));
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        yuk yukVar = this.j;
        if (yukVar != null) {
            yukVar.c.i();
        }
    }
}
