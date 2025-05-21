package com.google.android.gms.chimera.container.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.chimera.container.FileApkChimeraService;
import com.google.android.setupdesign.GlifLayout;
import defpackage.byhr;
import defpackage.edfq;
import defpackage.edjt;
import defpackage.qet;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleExtractionChimeraActivity extends qet {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ExtractionCompleteListener extends ResultReceiver {
        private final WeakReference a;

        public ExtractionCompleteListener(Handler handler, qet qetVar) {
            super(handler);
            this.a = new WeakReference(qetVar);
        }

        @Override // android.os.ResultReceiver
        protected final void onReceiveResult(int i, Bundle bundle) {
            qet qetVar = (qet) this.a.get();
            if (qetVar == null || qetVar.getSupportFragmentManager().z) {
                return;
            }
            qetVar.setResult(-1);
            qetVar.finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("asset_name");
        if (stringExtra == null) {
            setResult(0);
            finish();
            return;
        }
        edjt d = edjt.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new edjt(R.style.SudThemeGlif_Light, false).a(getIntent()));
        setContentView(R.layout.module_loading_activity);
        ((edfq) ((GlifLayout) findViewById(R.id.module_loading_layout)).q(edfq.class)).i.f(8);
        FileApkChimeraService.a(true, this, stringExtra, new ExtractionCompleteListener(new byhr(), this));
    }
}
