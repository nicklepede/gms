package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.aulm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class FastSafeParcelableJsonResponse extends aulm implements SafeParcelable {
    @Override // defpackage.aulm
    public boolean ag(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        aulm aulmVar = (aulm) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : b().values()) {
            if (e(fastJsonResponse$Field)) {
                if (!aulmVar.e(fastJsonResponse$Field) || !atyq.b(a(fastJsonResponse$Field), aulmVar.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (aulmVar.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : b().values()) {
            if (e(fastJsonResponse$Field)) {
                Object a = a(fastJsonResponse$Field);
                atzb.s(a);
                i = (i * 31) + a.hashCode();
            }
        }
        return i;
    }

    @Override // defpackage.aulm
    public Object z(String str) {
        return null;
    }
}
