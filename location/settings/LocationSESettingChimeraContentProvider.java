package com.google.android.gms.location.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import defpackage.eaqy;
import defpackage.eddi;
import defpackage.eqcy;
import defpackage.iri;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSESettingChimeraContentProvider extends ContentProvider {
    private eddi a;
    private eaqy b;

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        String string;
        String string2;
        Bundle bundle2 = new Bundle();
        int hashCode = str.hashCode();
        if (hashCode != -718440157) {
            if (hashCode == 161634297 && str.equals("getEAlertSummary")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("getDrivingBehaviorSummary")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            try {
                string = getContext().getString(true != ((Boolean) ((eqcy) this.a.b()).u()).booleanValue() ? R.string.ealert_summary_text_off : R.string.ealert_summary_text_on);
            } catch (InterruptedException | ExecutionException e) {
                e.toString();
                string = getContext().getString(R.string.ealert_summary_text_off);
            }
            bundle2.putCharSequence("com.android.settings.summary", string);
        } else if (c == 1) {
            try {
                Context context = getContext();
                int i = iri.a;
                ((Boolean) this.b.b().get()).booleanValue();
                string2 = context.getString(R.string.driving_behavior_summary_text_off);
            } catch (InterruptedException | ExecutionException e2) {
                e2.toString();
                string2 = getContext().getString(R.string.driving_behavior_summary_text_off);
            }
            bundle2.putCharSequence("com.android.settings.summary", string2);
        }
        return bundle2;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.a = eddi.a();
        this.b = eaqy.a();
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
