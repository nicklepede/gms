package com.google.android.gms.nearby.sharing.receive;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.sharing.receive.FileSelectionChimeraActivity;
import defpackage.aby;
import defpackage.acn;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FileSelectionChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerForActivityResult(new acn(), new aby() { // from class: csht
            @Override // defpackage.aby
            public final void jF(Object obj) {
                List list = (List) obj;
                fxxm.f(list, "uris");
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
