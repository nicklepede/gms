package com.google.android.gms.chimera.container.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.gms.R;
import com.google.android.gms.chimera.container.ui.ModuleDownloadChimeraActivity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.setupdesign.GlifLayout;
import defpackage.a;
import defpackage.aqfq;
import defpackage.aqir;
import defpackage.aubj;
import defpackage.aucp;
import defpackage.caqj;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.eftg;
import defpackage.efvx;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.elja;
import defpackage.elpg;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.rjb;
import defpackage.rlj;
import defpackage.rnu;
import defpackage.rtg;
import defpackage.rxx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ModuleDownloadChimeraActivity extends rxx {
    public Handler k;
    List l;
    String m;
    aqir n;
    private long o;
    private long p;
    private long q;
    private aubj r;
    private GlifLayout s;
    public int j = 0;
    private boolean t = false;

    private final String l() {
        return new FeatureRequestExtras.RequestReader(getIntent()).getSessionId();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void m(int i) {
        int i2;
        String str = null;
        int i3 = 6;
        if (i == 6) {
            this.r.c(new ApiFeatureRequest(this.l, false, null, this.m));
            i = 6;
        }
        aqir aqirVar = this.n;
        if (aqirVar != null) {
            this.r.e(aqirVar);
        }
        aqfq e = aqfq.e();
        String l = l();
        if (l != null) {
            e.f(l);
        }
        switch (i) {
            case 1:
                i2 = 105;
                break;
            case 2:
                i2 = 106;
                break;
            case 3:
                i2 = 107;
                break;
            case 4:
                i2 = 108;
                break;
            case 5:
                i2 = 109;
                break;
            case 6:
                i2 = 110;
                break;
            case 7:
                i2 = 117;
                break;
            default:
                i2 = 104;
                break;
        }
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            str = rjb.b(rtg.g(elgo.h(elja.j(this.l, new ekut() { // from class: aqim
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    Feature feature = (Feature) obj;
                    fgrc v = rnr.a.v();
                    String str2 = feature.a;
                    if (!v.b.L()) {
                        v.U();
                    }
                    rnr rnrVar = (rnr) v.b;
                    str2.getClass();
                    rnrVar.b |= 1;
                    rnrVar.c = str2;
                    long a = feature.a();
                    if (!v.b.L()) {
                        v.U();
                    }
                    rnr rnrVar2 = (rnr) v.b;
                    rnrVar2.b |= 2;
                    rnrVar2.d = a;
                    return (rnr) v.Q();
                }
            })), rjb.a), true).toString();
        }
        e.b(this, i2, str);
        if (l != null) {
            e.g(l);
        }
        Intent putExtra = new Intent().putExtra(rlj.FALLBACK_ONLY_TAG, true);
        FeatureRequestExtras.ResultBuilder resultBuilder = new FeatureRequestExtras.ResultBuilder();
        switch (i) {
            case 1:
                break;
            case 2:
                i3 = 1;
                break;
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 3;
                break;
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 5;
                break;
            default:
                Log.w("ModuleDownloadActivity", a.j(i, "Unexpected result code from download activity "));
                i3 = 1;
                break;
        }
        resultBuilder.setDownloadResult(i3);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.q;
        long j2 = this.p;
        if (j2 > 0) {
            j += elapsedRealtime - j2;
        }
        resultBuilder.setModuleDownloadActivityDurationMillis(elapsedRealtime - this.o);
        resultBuilder.setModuleDownloadActivityForegroundDurationMillis(j);
        resultBuilder.addToIntent(putExtra);
        setResult(-1, putExtra);
        finish();
    }

    public final void a(int i) {
        k(i, 0);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        super.finish();
        if (this.t) {
            if (this.j == 1) {
                efvx.e(getContainerActivity(), 2);
            } else {
                efvx.b(getContainerActivity(), 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.ui.ModuleDownloadChimeraActivity.k(int, int):void");
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        int i = this.j;
        if (i == 0 || i == 7) {
            i = 6;
        }
        m(i);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        elgo h;
        super.onCreate(bundle);
        if (bundle == null) {
            this.o = SystemClock.elapsedRealtime();
            this.q = 0L;
        } else {
            this.o = bundle.getLong("activity_start_time_millis");
            this.q = bundle.getLong("activity_foreground_duration_millis");
        }
        Intent intent = getIntent();
        this.t = eftg.b(intent);
        this.k = new caqj(new Handler.Callback() { // from class: aqin
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = ModuleDownloadChimeraActivity.this;
                moduleDownloadChimeraActivity.k(message.arg1, message.arg2);
                moduleDownloadChimeraActivity.k.removeMessages(0);
                return true;
            }
        });
        this.r = new aucp(this);
        String stringExtra = intent.getStringExtra("get_module_install_request_package");
        if (stringExtra == null) {
            stringExtra = "com.google.android.gms";
        }
        this.m = stringExtra;
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("chimera.FEATURE_LIST");
            if (byteArrayExtra == null) {
                int i = elgo.d;
                h = elpg.a;
            } else {
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgri y = fgri.y(rnu.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a);
                fgri.M(y);
                h = elgo.h(elja.j(((rnu) y).b, new ekut() { // from class: aqgl
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        rnr rnrVar = (rnr) obj;
                        return new Feature(rnrVar.c, rnrVar.d);
                    }
                }));
            }
            this.l = h;
            if (h.isEmpty()) {
                m(1);
                return;
            }
            int i2 = efwn.a;
            boolean v = efrl.v(this);
            efwo d = efwo.d();
            int i3 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new efwo(efwn.b(this), v).b(intent, !v));
            efwn.d();
            setContentView(R.layout.module_install_activity_sud_v2);
            GlifLayout glifLayout = (GlifLayout) findViewById(R.id.module_install_sud_layout_v2);
            this.s = glifLayout;
            ((efsl) glifLayout.q(efsl.class)).i.f = new View.OnClickListener() { // from class: aqil
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = ModuleDownloadChimeraActivity.this;
                    int i4 = moduleDownloadChimeraActivity.j;
                    if (i4 == 0 || i4 == 7 || i4 == 2 || i4 == 3 || i4 == 4) {
                        moduleDownloadChimeraActivity.onBackPressed();
                    } else {
                        if (i4 != 5) {
                            throw new IllegalArgumentException(a.B(i4, " is not a valid state"));
                        }
                        moduleDownloadChimeraActivity.a(0);
                    }
                }
            };
            if (bundle != null) {
                this.j = bundle.getInt("state", 0);
            }
            a(this.j);
        } catch (fgsd e) {
            Log.e("ModuleDownloadActivity", "Invalid FeatureList: ".concat(e.toString()));
            m(2);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        aqir aqirVar = this.n;
        if (aqirVar != null) {
            this.r.e(aqirVar);
            this.n = null;
            this.k.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        this.q += SystemClock.elapsedRealtime() - this.p;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        this.p = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.j);
        bundle.putLong("activity_start_time_millis", this.o);
        bundle.putLong("activity_foreground_duration_millis", this.q);
    }
}
