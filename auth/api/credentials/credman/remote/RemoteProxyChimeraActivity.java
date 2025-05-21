package com.google.android.gms.auth.api.credentials.credman.remote;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.remote.RemoteProxyChimeraActivity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.abv;
import defpackage.acm;
import defpackage.iru;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wxq;
import defpackage.wxr;
import defpackage.wyb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RemoteProxyChimeraActivity extends qet {
    public wxr j;
    public abv k;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        wxr wxrVar = (wxr) new jrh(this, new wxq(getIntent())).a(wxr.class);
        this.j = wxrVar;
        wxrVar.e.g(this, new jpd() { // from class: wxc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                RemoteProxyChimeraActivity.this.k.b(new ace((PendingIntent) obj).a());
            }
        });
        this.j.d.g(this, new jpd() { // from class: wxd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                wpu wpuVar = (wpu) obj;
                int a = wpuVar.a();
                Intent b = wpuVar.b();
                RemoteProxyChimeraActivity remoteProxyChimeraActivity = RemoteProxyChimeraActivity.this;
                remoteProxyChimeraActivity.setResult(a, b);
                remoteProxyChimeraActivity.finish();
            }
        });
        this.k = registerForActivityResult(new acm(), new wyb(new iru() { // from class: wxe
            @Override // defpackage.iru
            public final void a(Object obj) {
                wxr wxrVar2 = RemoteProxyChimeraActivity.this.j;
                wxrVar2.n = (PublicKeyCredential) obj;
                wxrVar2.c.g();
            }
        }, new iru() { // from class: wxf
            @Override // defpackage.iru
            public final void a(Object obj) {
                RemoteProxyChimeraActivity.this.j.c.j(((wya) obj).a);
            }
        }, 28451));
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        wxr wxrVar = this.j;
        if (wxrVar != null) {
            wxrVar.c.i();
        }
    }
}
