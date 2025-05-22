package com.google.android.gms.chimera.container.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.chimera.container.FileApkChimeraService;
import com.google.android.setupdesign.GlifLayout;
import defpackage.caqj;
import defpackage.efsl;
import defpackage.efwo;
import defpackage.rxx;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ModuleExtractionChimeraActivity extends rxx {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class ExtractionCompleteListener extends ResultReceiver {
        private final WeakReference a;

        public ExtractionCompleteListener(Handler handler, rxx rxxVar) {
            super(handler);
            this.a = new WeakReference(rxxVar);
        }

        @Override // android.os.ResultReceiver
        protected final void onReceiveResult(int i, Bundle bundle) {
            rxx rxxVar = (rxx) this.a.get();
            if (rxxVar == null || rxxVar.getSupportFragmentManager().z) {
                return;
            }
            rxxVar.setResult(-1);
            rxxVar.finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("asset_name");
        if (stringExtra == null) {
            setResult(0);
            finish();
            return;
        }
        efwo d = efwo.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new efwo(R.style.SudThemeGlif_Light, false).a(getIntent()));
        setContentView(R.layout.module_loading_activity);
        ((efsl) ((GlifLayout) findViewById(R.id.module_loading_layout)).q(efsl.class)).i.f(8);
        FileApkChimeraService.a(true, this, stringExtra, new ExtractionCompleteListener(new caqj(), this));
    }
}
