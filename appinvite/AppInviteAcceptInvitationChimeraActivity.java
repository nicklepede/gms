package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.bp;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.ew;
import defpackage.fkbj;
import defpackage.ips;
import defpackage.qfp;
import defpackage.twf;
import defpackage.uaz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppInviteAcceptInvitationChimeraActivity extends qfp {
    public static final asot j = asot.b("AcceptInvitation", asej.APP_INVITE);
    private bqqa k;

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
            ((ejhf) j.i()).z("Inline install failed. Error code: %d", i2);
        }
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aseu aseuVar = aseu.FDL_APPINVITE_ACCEPT_INVITATION_ACTIVITY;
        if (this.k == null) {
            eijr eijrVar = bqqe.a;
            this.k = new bqqa();
        }
        bqqa.a(aseuVar);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            ((ejhf) j.i()).x("Missing data URI");
            finish();
            return;
        }
        if (fkbj.a.a().c()) {
            if (fkbj.a.a().d()) {
                int i = ips.a;
            }
            if (intent.getAction() == null) {
                ((ejhf) j.i()).x("Missing Intent action");
                finish();
                return;
            } else if (data.getScheme() == null) {
                ((ejhf) j.i()).B("Invalid URI: %s", data);
                finish();
                return;
            } else if (!Objects.equals(data.getScheme(), "https") && !Objects.equals(data.getScheme(), "http")) {
                ((ejhf) j.i()).B("Invalid URI Scheme: %s", data);
                finish();
                return;
            }
        }
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        if (((uaz) supportFragmentManager.h("progressFragment")) == null) {
            bpVar.v(uaz.y(), "progressFragment");
        }
        if (supportFragmentManager.h("acceptFragment") == null) {
            twf twfVar = new twf();
            twfVar.setRetainInstance(true);
            bpVar.v(twfVar, "acceptFragment");
        }
        if (bpVar.j()) {
            return;
        }
        bpVar.a();
    }
}
