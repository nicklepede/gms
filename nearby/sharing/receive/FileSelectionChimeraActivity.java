package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.sharing.receive.FileSelectionChimeraActivity;
import defpackage.abt;
import defpackage.aci;
import defpackage.qet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FileSelectionChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerForActivityResult(new aci(), new abt() { // from class: cpyw
            @Override // defpackage.abt
            public final void jq(Object obj) {
                List list = (List) obj;
                fvbo.f(list, "uris");
                boolean isEmpty = list.isEmpty();
                FileSelectionChimeraActivity fileSelectionChimeraActivity = FileSelectionChimeraActivity.this;
                if (isEmpty) {
                    fileSelectionChimeraActivity.setResult(0);
                } else {
                    Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                    intent.setType("*/*");
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(list));
                    intent.setClassName(fileSelectionChimeraActivity.getPackageName(), "com.google.android.gms.nearby.sharing.send.SendActivity");
                    intent.addFlags(268468224);
                    fileSelectionChimeraActivity.setResult(-1);
                    fileSelectionChimeraActivity.startActivity(intent);
                }
                fileSelectionChimeraActivity.finish();
            }
        }).b("*/*");
    }
}
