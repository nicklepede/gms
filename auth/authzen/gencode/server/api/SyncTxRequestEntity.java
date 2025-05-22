package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.abug;
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
public final class SyncTxRequestEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new abug();
    private static final HashMap f;
    final Set a;
    String b;
    String c;
    String d;
    List e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("accountName", new FastJsonResponse$Field(7, false, 7, false, "accountName", 2, null));
        hashMap.put("deviceId", new FastJsonResponse$Field(7, false, 7, false, "deviceId", 3, null));
        hashMap.put("secureSyncRequest", new FastJsonResponse$Field(7, false, 7, false, "secureSyncRequest", 4, null));
        hashMap.put("seenWebViewPromptTxIds", new FastJsonResponse$Field(7, true, 7, true, "seenWebViewPromptTxIds", 5, null));
    }

    public SyncTxRequestEntity(Set set, String str, String str2, String str3, List list) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
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
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return f;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof SyncTxRequestEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SyncTxRequestEntity syncTxRequestEntity = (SyncTxRequestEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!syncTxRequestEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(syncTxRequestEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (syncTxRequestEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
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

    @Override // defpackage.aulm
    protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 5) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an array of String."));
        }
        this.e = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
            atzr.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.x(parcel, 5, this.e, true);
        }
        atzr.c(parcel, a);
    }

    public SyncTxRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
