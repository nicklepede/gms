package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import android.os.Bundle;
import defpackage.chet;
import defpackage.conm;
import defpackage.cqqt;
import defpackage.cqqu;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemoteCopyShareSheetChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        chet chetVar = conm.a;
        chetVar.b().p("RemoteCopyShareSheetChimeraActivity created", new Object[0]);
        super.onCreate(bundle);
        Intent a = cqqu.a(this, getIntent(), cqqt.a);
        if (a == null) {
            chetVar.a().h("ClipDate = %s", getIntent().getClipData());
        } else {
            startActivity(a);
            finish();
        }
    }
}
