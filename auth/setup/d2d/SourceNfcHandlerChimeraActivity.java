package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.auad;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SourceNfcHandlerChimeraActivity extends ryr {
    private final void a() {
        Toast.makeText(this, R.string.common_something_went_wrong, 0).show();
        finish();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
            a();
            return;
        }
        NdefMessage ndefMessage = (NdefMessage) parcelableArrayExtra[0];
        if (ndefMessage == null) {
            a();
            return;
        }
        NdefRecord[] records = ndefMessage.getRecords();
        if (records != null && records.length > 0) {
            byte[] payload = records[0].getPayload();
            auad auadVar = SourceChimeraActivity.h;
            startActivity(new Intent().setClassName(this, "com.google.android.gms.auth.setup.d2d.SourceActivity").putExtra("payload", payload));
        }
        finish();
    }
}
