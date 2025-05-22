package com.google.android.gms.dtdi.core.orchestration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dtdi.core.internal.SetMediaTransferEnabledParams;
import com.google.android.gms.dtdi.core.orchestration.OrchestrationTrampolineChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.ausn;
import defpackage.bacl;
import defpackage.badc;
import defpackage.baey;
import defpackage.bags;
import defpackage.bazr;
import defpackage.bbck;
import defpackage.bbdl;
import defpackage.dhln;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fxxm;
import defpackage.qer;
import defpackage.qgd;
import defpackage.qgo;
import defpackage.qhj;
import defpackage.qhk;
import defpackage.qic;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class OrchestrationTrampolineChimeraActivity extends ryt {
    public static final ausn j = baey.a("OrchestrationTrampolineChimeraActivity");
    public int k;
    private bags l;
    private bbck m;
    private bbdl n;
    private final aby o = new aby() { // from class: bbdi
        @Override // defpackage.aby
        public final void jF(Object obj) {
            qic qicVar;
            ActivityResult activityResult = (ActivityResult) obj;
            fxxm.f(activityResult, "result");
            int i = activityResult.a;
            if (i == -1) {
                Intent intent = activityResult.b;
                qicVar = intent == null ? qic.STATE_UNKNOWN : intent.getBooleanExtra("com.google.android.gms.dtdi.halfsheet.extra.statusEnabled", true) ? qic.STATE_ENABLED : qic.STATE_DISABLED;
            } else if (i != 0) {
                qicVar = qic.STATE_UNKNOWN;
            } else {
                Intent intent2 = activityResult.b;
                qicVar = (intent2 == null || !fxxm.n(intent2.getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.cancellationReason"), "com.google.android.gms.dtdi.halfsheet.extra.cancellationReasonActivityDismissed")) ? qic.STATE_UNKNOWN : qic.STATE_PROMPTABLE;
            }
            OrchestrationTrampolineChimeraActivity orchestrationTrampolineChimeraActivity = OrchestrationTrampolineChimeraActivity.this;
            int ordinal = qicVar.ordinal();
            if (ordinal == 1) {
                orchestrationTrampolineChimeraActivity.a(qer.MEDIA_TRANSFER_OPT_IN_STATE_DECLINED);
                orchestrationTrampolineChimeraActivity.b(qicVar);
                ((eluo) OrchestrationTrampolineChimeraActivity.j.h()).x("MTSettingDebug Opt-in activity result: DISABLED");
            } else if (ordinal == 2) {
                orchestrationTrampolineChimeraActivity.a(qer.MEDIA_TRANSFER_OPT_IN_STATE_ACCEPTED);
                orchestrationTrampolineChimeraActivity.b(qicVar);
                ((eluo) OrchestrationTrampolineChimeraActivity.j.h()).x("MTSettingDebug Opt-in activity result: ENABLED");
            } else if (ordinal != 3) {
                orchestrationTrampolineChimeraActivity.a(qer.MEDIA_TRANSFER_OPT_IN_STATE_UNKNOWN);
                ((eluo) OrchestrationTrampolineChimeraActivity.j.j()).z("MTSettingDebug Unexpected result from opt-in. Result code: %s", i);
            } else {
                ausn ausnVar = OrchestrationTrampolineChimeraActivity.j;
                ((eluo) ausnVar.h()).F("MTSettingDebug Opt-in activity was dismissed %s out of %s times", orchestrationTrampolineChimeraActivity.k, bawi.y());
                if (orchestrationTrampolineChimeraActivity.k >= bawi.y()) {
                    orchestrationTrampolineChimeraActivity.a(qer.MEDIA_TRANSFER_OPT_IN_STATE_DISMISSED_TO_DISABLE);
                    orchestrationTrampolineChimeraActivity.b(qic.STATE_DISABLED);
                    ((eluo) ausnVar.h()).B("MTSettingDebug Reached max # of opt-in dismissals. Setting=%s", "STATE_DISABLED");
                } else {
                    orchestrationTrampolineChimeraActivity.a(qer.MEDIA_TRANSFER_OPT_IN_STATE_DISMISSED);
                }
            }
            orchestrationTrampolineChimeraActivity.finish();
        }
    };

    public final void a(qer qerVar) {
        bbdl bbdlVar = this.n;
        if (bbdlVar != null) {
            badc a = bbdlVar.a();
            bbck bbckVar = this.m;
            if (bbckVar != null) {
                fxxm.f(qerVar, "state");
                qhk a2 = qhj.a(qgo.a.v());
                fgrc v = qgd.a.v();
                fxxm.f(v, "builder");
                fxxm.f(qerVar, "value");
                if (!v.b.L()) {
                    v.U();
                }
                qgd qgdVar = (qgd) v.b;
                qgdVar.c = qerVar.g;
                qgdVar.b |= 1;
                fgri Q = v.Q();
                fxxm.e(Q, "build(...)");
                qgd qgdVar2 = (qgd) Q;
                fxxm.f(qgdVar2, "value");
                fgrc fgrcVar = a2.a;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                qgo qgoVar = (qgo) fgrcVar.b;
                qgdVar2.getClass();
                qgoVar.h = qgdVar2;
                qgoVar.b |= 32;
                bbckVar.b.a(a2.a(), a, bbckVar.a);
            }
        }
    }

    public final void b(qic qicVar) {
        atai ataiVar = this.l;
        if (ataiVar != null) {
            final boolean z = qicVar == qic.STATE_ENABLED;
            atfn atfnVar = new atfn();
            atfnVar.a = new atfd() { // from class: bazo
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    int i = bazr.a;
                    bazq bazqVar = new bazq((dhma) obj2);
                    bbaf bbafVar = (bbaf) ((bazs) obj).H();
                    SetMediaTransferEnabledParams setMediaTransferEnabledParams = new SetMediaTransferEnabledParams();
                    setMediaTransferEnabledParams.a = z;
                    setMediaTransferEnabledParams.c = 1;
                    setMediaTransferEnabledParams.b = bazqVar;
                    bbafVar.a(setMediaTransferEnabledParams);
                }
            };
            atfnVar.c = new Feature[]{bacl.b};
            atfnVar.d = 28308;
            ((atad) ataiVar).ji(atfnVar.a()).y(new dhln() { // from class: bbdj
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    ((eluo) OrchestrationTrampolineChimeraActivity.j.j()).x("MTSettingDebug Error updating the internal state of the Media Transfer setting.");
                }
            });
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        fxxm.e(applicationContext, "getApplicationContext(...)");
        fxxm.f(applicationContext, "context");
        this.l = new bazr(applicationContext);
        Context applicationContext2 = getApplicationContext();
        fxxm.e(applicationContext2, "getApplicationContext(...)");
        this.m = new bbck(applicationContext2);
        this.n = new bbdl(null);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            int i = extras != null ? extras.getInt("com.google.android.gms.dtdi.orchestration.extra.optInShownCount") : 0;
            this.k = i;
            ((eluo) j.h()).z("MTSettingDebug optInShownCount set to %s", i);
        }
        aca registerForActivityResult = registerForActivityResult(new acq(), this.o);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.dtdi.halfsheet.HalfSheetActivity");
        fxxm.e(className, "setClassName(...)");
        className.putExtra("com.google.android.gms.dtdi.halfsheet.extra.TYPE", 1);
        registerForActivityResult.b(className);
    }
}
