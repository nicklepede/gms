package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cmfe;
import defpackage.cohy;
import defpackage.cohz;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RemoteCopyShareSheetChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        cmfe.a.b().p("RemoteCopyShareSheetChimeraActivity created", new Object[0]);
        super.onCreate(bundle);
        Intent a = cohz.a(this, getIntent(), cohy.a);
        if (a == null) {
            cmfe.a.a().h("ClipDate = %s", getIntent().getClipData());
        } else {
            startActivity(a);
            finish();
        }
    }
}
