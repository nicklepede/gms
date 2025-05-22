package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.bp;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.ew;
import defpackage.fmrs;
import defpackage.iri;
import defpackage.ryt;
import defpackage.vsf;
import defpackage.vwy;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppInviteAcceptInvitationChimeraActivity extends ryt {
    public static final ausn j = ausn.b("AcceptInvitation", auid.APP_INVITE);
    private bsxr k;

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    startActivity(intent);
                }
                i2 = -1;
            }
            i = 1;
        }
        if (i == 0 && i2 != -1) {
            ((eluo) j.i()).z("Inline install failed. Error code: %d", i2);
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auio auioVar = auio.FDL_APPINVITE_ACCEPT_INVITATION_ACTIVITY;
        if (this.k == null) {
            ekww ekwwVar = bsxv.a;
            this.k = new bsxr();
        }
        bsxr.a(auioVar);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            ((eluo) j.i()).x("Missing data URI");
            finish();
            return;
        }
        fmrs fmrsVar = fmrs.a;
        if (fmrsVar.lK().c()) {
            if (fmrsVar.lK().d()) {
                int i = iri.a;
            }
            if (intent.getAction() == null) {
                ((eluo) j.i()).x("Missing Intent action");
                finish();
                return;
            } else if (data.getScheme() == null) {
                ((eluo) j.i()).B("Invalid URI: %s", data);
                finish();
                return;
            } else if (!Objects.equals(data.getScheme(), "https") && !Objects.equals(data.getScheme(), "http")) {
                ((eluo) j.i()).B("Invalid URI Scheme: %s", data);
                finish();
                return;
            }
        }
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        if (((vwy) supportFragmentManager.h("progressFragment")) == null) {
            bpVar.v(vwy.y(), "progressFragment");
        }
        if (supportFragmentManager.h("acceptFragment") == null) {
            vsf vsfVar = new vsf();
            vsfVar.setRetainInstance(true);
            bpVar.v(vsfVar, "acceptFragment");
        }
        if (bpVar.j()) {
            return;
        }
        bpVar.a();
    }
}
