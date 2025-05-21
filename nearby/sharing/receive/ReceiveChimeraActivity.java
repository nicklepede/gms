package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.nearby.sharing.receive.ReceiveChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.cfdj;
import defpackage.cmdb;
import defpackage.cmep;
import defpackage.cmfe;
import defpackage.cmhu;
import defpackage.cohy;
import defpackage.cohz;
import defpackage.cpyy;
import defpackage.cpzi;
import defpackage.cqae;
import defpackage.cqaf;
import defpackage.cqag;
import defpackage.cqel;
import defpackage.cqfp;
import defpackage.crjh;
import defpackage.crjo;
import defpackage.fqmk;
import defpackage.fuuw;
import defpackage.fuy;
import defpackage.fvaf;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvgt;
import defpackage.ivf;
import defpackage.joo;
import defpackage.jqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ReceiveChimeraActivity extends cpyy {
    public cmhu f;
    public cmdb g;
    public cqel h;
    public final abv i;
    private final fuuw j;

    public ReceiveChimeraActivity() {
        fvaf fvafVar = new fvaf() { // from class: cpzd
            @Override // defpackage.fvaf
            public final Object a() {
                ReceiveChimeraActivity receiveChimeraActivity = ReceiveChimeraActivity.this;
                cqel cqelVar = receiveChimeraActivity.h;
                if (cqelVar == null) {
                    fvbo.j("factory");
                    cqelVar = null;
                }
                cqelVar.a = receiveChimeraActivity;
                return cqelVar;
            }
        };
        int i = fvcc.a;
        this.j = new jqx(new fvbi(cqfp.class), new cqaf(this), fvafVar, new cqag(this));
        this.i = registerForActivityResult(new acl(), new abt() { // from class: cpze
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "result");
                if (activityResult.a == -1) {
                    ReceiveChimeraActivity.this.finish();
                }
            }
        });
    }

    public final cmdb b() {
        cmdb cmdbVar = this.g;
        if (cmdbVar != null) {
            return cmdbVar;
        }
        fvbo.j("analyticsLogger");
        return null;
    }

    public final cqfp c() {
        return (cqfp) this.j.a();
    }

    @Override // defpackage.cpyy, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        fvbo.e(intent, "getIntent(...)");
        Intent a = cohz.a(this, intent, cohy.d);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        cmep.b(this);
        fvgt.b(joo.a(this), null, null, new cpzi(this, null), 3);
        boolean z = fqmk.a.a().bg() || ((extras = getIntent().getExtras()) != null && extras.getBoolean("enable_send_button_on_receive_ui", false));
        crjh crjhVar = new crjh(new crjo(this, cfdj.f()));
        ivf.a(getWindow(), false);
        cmdb f = cmdb.f(this);
        fvbo.f(f, "<set-?>");
        this.g = f;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(-198976679, true, new cqae(this, crjhVar, z)));
        setContentView(composeView);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        super.onNewIntent(intent);
        if (fqmk.F()) {
            cmfe.a.b().h("ReceiveChimeraActivity onNewIntent setting intent to: %s", intent.getData());
            c().c = true;
            setIntent(intent);
        }
    }
}
