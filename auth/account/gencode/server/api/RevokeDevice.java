package com.google.android.gms.auth.account.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.arxc;
import defpackage.viy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RevokeDevice extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new viy();
    private static final HashMap c;
    public final Set a;
    String b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("version_info", new FastJsonResponse$Field(7, false, 7, false, "version_info", 2, null));
    }

    public RevokeDevice(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return c;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof RevokeDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RevokeDevice revokeDevice = (RevokeDevice) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!revokeDevice.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(revokeDevice.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (revokeDevice.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
        }
        this.b = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
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
        arxc.c(parcel, a);
    }

    public RevokeDevice() {
        this.a = new HashSet();
    }
}
