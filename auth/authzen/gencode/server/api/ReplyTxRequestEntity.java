package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.abuf;
import defpackage.atqs;
import defpackage.atzr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ReplyTxRequestEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new abuf();
    private static final HashMap d;
    final Set a;
    String b;
    String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("accountName", new FastJsonResponse$Field(7, false, 7, false, "accountName", 2, null));
        hashMap.put("secureTxLedger", new FastJsonResponse$Field(7, false, 7, false, "secureTxLedger", 3, null));
    }

    public ReplyTxRequestEntity(Set set, String str, String str2) {
        this.a = set;
        this.b = str;
        this.c = str2;
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
        if (!(obj instanceof ReplyTxRequestEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ReplyTxRequestEntity replyTxRequestEntity = (ReplyTxRequestEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!replyTxRequestEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(replyTxRequestEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (replyTxRequestEntity.e(fastJsonResponse$Field)) {
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
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
        }
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
            atzr.v(parcel, 3, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public ReplyTxRequestEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
