package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.abuh;
import defpackage.atqs;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SyncTxResponseEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new abuh();
    private static final HashMap d;
    public final Set a;
    public String b;
    List c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("secureSyncResponse", new FastJsonResponse$Field(7, false, 7, false, "secureSyncResponse", 2, null));
        hashMap.put("webViewPrompts", new FastJsonResponse$Field(11, true, 11, true, "webViewPrompts", 3, SyncTxResponseWebViewPromptEntity.class));
    }

    public SyncTxResponseEntity(Set set, String str, List list) {
        this.a = set;
        this.b = str;
        this.c = list;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof SyncTxResponseEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SyncTxResponseEntity syncTxResponseEntity = (SyncTxResponseEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!syncTxResponseEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(syncTxResponseEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (syncTxResponseEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
        }
        this.b = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.y(parcel, 3, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public SyncTxResponseEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
