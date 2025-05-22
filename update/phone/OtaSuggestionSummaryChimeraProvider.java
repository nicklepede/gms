package com.google.android.gms.update.phone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;
import defpackage.apzg;
import defpackage.auad;
import defpackage.dhmr;
import defpackage.djol;
import defpackage.djqn;
import defpackage.djuz;
import defpackage.ftqe;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OtaSuggestionSummaryChimeraProvider extends ContentProvider {
    private static final auad a = djuz.h("OtaSuggestionSummaryChimeraProvider");

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        a.h("OtaSuggestionSummaryChimeraProvider is called!", new Object[0]);
        Bundle bundle2 = new Bundle();
        Context context = getContext();
        try {
            long currentTimeMillis = System.currentTimeMillis() - ((SystemUpdateStatus) dhmr.n(djol.a(context).e())).n;
            int max = (int) Math.max(TimeUnit.MILLISECONDS.toDays(currentTimeMillis), 1L);
            auad auadVar = djqn.a;
            int a2 = djqn.a(ftqe.a.lK().a(), currentTimeMillis);
            if ("getSummary".equals(str)) {
                Icon createWithResource = Icon.createWithResource(context, apzg.a(context, a2 != 2 ? a2 != 3 ? R.drawable.quantum_gm_ic_system_update_blue_24 : R.drawable.quantum_gm_ic_system_update_red_24 : R.drawable.quantum_gm_ic_system_update_orange_24));
                bundle2.putString("com.android.settings.title", a2 == 0 ? context.getText(R.string.system_update_overdue_suggestion_title_text).toString() : context.getText(R.string.system_update_overdue_status_text).toString());
                bundle2.putString("com.android.settings.summary", a2 == 0 ? context.getText(R.string.system_update_update_available_title_text).toString() : TextUtils.expandTemplate(context.getText(R.string.system_update_overdue_warning), context.getResources().getQuantityString(R.plurals.ota_unit_days, max, Integer.valueOf(max))).toString());
                bundle2.putParcelable("com.android.settings.icon", createWithResource);
            }
            return bundle2;
        } catch (InterruptedException | ExecutionException e) {
            a.g("Unable to get SystemUpdateStatus", e, new Object[0]);
            return bundle2;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete operation not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType operation not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert operation not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("query operation not supported currently.");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update operation not supported currently.");
    }
}
