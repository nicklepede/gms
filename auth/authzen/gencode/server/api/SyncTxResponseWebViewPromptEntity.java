package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.arod;
import defpackage.arxc;
import defpackage.zui;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SyncTxResponseWebViewPromptEntity extends FastSafeParcelableJsonResponse implements arod {
    public static final Parcelable.Creator CREATOR = new zui();
    private static final HashMap e;
    final Set a;
    String b;
    String c;
    String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("timeUntilExpirationMillis", new FastJsonResponse$Field(7, false, 7, false, "timeUntilExpirationMillis", 2, null));
        hashMap.put("url", new FastJsonResponse$Field(7, false, 7, false, "url", 3, null));
        hashMap.put("webViewPromptTxId", new FastJsonResponse$Field(7, false, 7, false, "webViewPromptTxId", 4, null));
    }

    public SyncTxResponseWebViewPromptEntity(Set set, String str, String str2, String str3) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof SyncTxResponseWebViewPromptEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SyncTxResponseWebViewPromptEntity syncTxResponseWebViewPromptEntity = (SyncTxResponseWebViewPromptEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!syncTxResponseWebViewPromptEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(syncTxResponseWebViewPromptEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (syncTxResponseWebViewPromptEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 3) {
            this.c = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.d = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        arxc.c(parcel, a);
    }

    public SyncTxResponseWebViewPromptEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
