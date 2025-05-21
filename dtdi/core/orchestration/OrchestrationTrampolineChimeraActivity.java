package com.google.android.gms.dtdi.core.orchestration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dtdi.core.internal.SetMediaTransferEnabledParams;
import com.google.android.gms.dtdi.core.orchestration.OrchestrationTrampolineChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asot;
import defpackage.axyl;
import defpackage.axzc;
import defpackage.ayay;
import defpackage.aycs;
import defpackage.ayvx;
import defpackage.ayyq;
import defpackage.ayzt;
import defpackage.dfah;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fvbo;
import defpackage.olo;
import defpackage.ona;
import defpackage.onl;
import defpackage.oog;
import defpackage.ooh;
import defpackage.ooz;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class OrchestrationTrampolineChimeraActivity extends qfp {
    public static final asot j = ayay.a("OrchestrationTrampolineChimeraActivity");
    public int k;
    private aycs l;
    private ayyq m;
    private ayzt n;
    private final abt o = new abt() { // from class: ayzq
        @Override // defpackage.abt
        public final void jq(Object obj) {
            ooz oozVar;
            ActivityResult activityResult = (ActivityResult) obj;
            fvbo.f(activityResult, "result");
            int i = activityResult.a;
            if (i == -1) {
                Intent intent = activityResult.b;
                oozVar = intent == null ? ooz.STATE_UNKNOWN : intent.getBooleanExtra("com.google.android.gms.dtdi.halfsheet.extra.statusEnabled", true) ? ooz.STATE_ENABLED : ooz.STATE_DISABLED;
            } else if (i != 0) {
                oozVar = ooz.STATE_UNKNOWN;
            } else {
                Intent intent2 = activityResult.b;
                oozVar = (intent2 == null || !fvbo.n(intent2.getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.cancellationReason"), "com.google.android.gms.dtdi.halfsheet.extra.cancellationReasonActivityDismissed")) ? ooz.STATE_UNKNOWN : ooz.STATE_PROMPTABLE;
            }
            OrchestrationTrampolineChimeraActivity orchestrationTrampolineChimeraActivity = OrchestrationTrampolineChimeraActivity.this;
            int ordinal = oozVar.ordinal();
            if (ordinal == 1) {
                orchestrationTrampolineChimeraActivity.a(olo.MEDIA_TRANSFER_OPT_IN_STATE_DECLINED);
                orchestrationTrampolineChimeraActivity.b(oozVar);
                ((ejhf) OrchestrationTrampolineChimeraActivity.j.h()).x("MTSettingDebug Opt-in activity result: DISABLED");
            } else if (ordinal == 2) {
                orchestrationTrampolineChimeraActivity.a(olo.MEDIA_TRANSFER_OPT_IN_STATE_ACCEPTED);
                orchestrationTrampolineChimeraActivity.b(oozVar);
                ((ejhf) OrchestrationTrampolineChimeraActivity.j.h()).x("MTSettingDebug Opt-in activity result: ENABLED");
            } else if (ordinal != 3) {
                orchestrationTrampolineChimeraActivity.a(olo.MEDIA_TRANSFER_OPT_IN_STATE_UNKNOWN);
                ((ejhf) OrchestrationTrampolineChimeraActivity.j.j()).z("MTSettingDebug Unexpected result from opt-in. Result code: %s", i);
            } else {
                asot asotVar = OrchestrationTrampolineChimeraActivity.j;
                ((ejhf) asotVar.h()).F("MTSettingDebug Opt-in activity was dismissed %s out of %s times", orchestrationTrampolineChimeraActivity.k, ayso.y());
                if (orchestrationTrampolineChimeraActivity.k >= ayso.y()) {
                    orchestrationTrampolineChimeraActivity.a(olo.MEDIA_TRANSFER_OPT_IN_STATE_DISMISSED_TO_DISABLE);
                    orchestrationTrampolineChimeraActivity.b(ooz.STATE_DISABLED);
                    ((ejhf) asotVar.h()).B("MTSettingDebug Reached max # of opt-in dismissals. Setting=%s", "STATE_DISABLED");
                } else {
                    orchestrationTrampolineChimeraActivity.a(olo.MEDIA_TRANSFER_OPT_IN_STATE_DISMISSED);
                }
            }
            orchestrationTrampolineChimeraActivity.finish();
        }
    };

    public final void a(olo oloVar) {
        ayzt ayztVar = this.n;
        if (ayztVar != null) {
            axzc a = ayztVar.a();
            ayyq ayyqVar = this.m;
            if (ayyqVar != null) {
                fvbo.f(oloVar, "state");
                ooh a2 = oog.a(onl.a.v());
                fecj v = ona.a.v();
                fvbo.f(v, "builder");
                fvbo.f(oloVar, "value");
                if (!v.b.L()) {
                    v.U();
                }
                ona onaVar = (ona) v.b;
                onaVar.c = oloVar.g;
                onaVar.b |= 1;
                fecp Q = v.Q();
                fvbo.e(Q, "build(...)");
                ona onaVar2 = (ona) Q;
                fvbo.f(onaVar2, "value");
                fecj fecjVar = a2.a;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                onl onlVar = (onl) fecjVar.b;
                onaVar2.getClass();
                onlVar.h = onaVar2;
                onlVar.b |= 32;
                ayyqVar.b.a(a2.a(), a, ayyqVar.a);
            }
        }
    }

    public final void b(ooz oozVar) {
        aqxt aqxtVar = this.l;
        if (aqxtVar != null) {
            final boolean z = oozVar == ooz.STATE_ENABLED;
            arcy arcyVar = new arcy();
            arcyVar.a = new arco() { // from class: ayvu
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    int i = ayvx.a;
                    ayvw ayvwVar = new ayvw((dfau) obj2);
                    aywl aywlVar = (aywl) ((ayvy) obj).H();
                    SetMediaTransferEnabledParams setMediaTransferEnabledParams = new SetMediaTransferEnabledParams();
                    setMediaTransferEnabledParams.a = z;
                    setMediaTransferEnabledParams.c = 1;
                    setMediaTransferEnabledParams.b = ayvwVar;
                    aywlVar.a(setMediaTransferEnabledParams);
                }
            };
            arcyVar.c = new Feature[]{axyl.b};
            arcyVar.d = 28308;
            ((aqxo) aqxtVar).iT(arcyVar.a()).y(new dfah() { // from class: ayzr
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    ((ejhf) OrchestrationTrampolineChimeraActivity.j.j()).x("MTSettingDebug Error updating the internal state of the Media Transfer setting.");
                }
            });
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        fvbo.e(applicationContext, "getApplicationContext(...)");
        fvbo.f(applicationContext, "context");
        this.l = new ayvx(applicationContext);
        Context applicationContext2 = getApplicationContext();
        fvbo.e(applicationContext2, "getApplicationContext(...)");
        this.m = new ayyq(applicationContext2);
        this.n = new ayzt(null);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            int i = extras != null ? extras.getInt("com.google.android.gms.dtdi.orchestration.extra.optInShownCount") : 0;
            this.k = i;
            ((ejhf) j.h()).z("MTSettingDebug optInShownCount set to %s", i);
        }
        abv registerForActivityResult = registerForActivityResult(new acl(), this.o);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.dtdi.halfsheet.HalfSheetActivity");
        fvbo.e(className, "setClassName(...)");
        className.putExtra("com.google.android.gms.dtdi.halfsheet.extra.TYPE", 1);
        registerForActivityResult.b(className);
    }
}
