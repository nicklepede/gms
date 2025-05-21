package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.ashs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class FastSafeParcelableJsonResponse extends ashs implements SafeParcelable {
    @Override // defpackage.ashs
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
        ashs ashsVar = (ashs) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : b().values()) {
            if (e(fastJsonResponse$Field)) {
                if (!ashsVar.e(fastJsonResponse$Field) || !arwb.b(a(fastJsonResponse$Field), ashsVar.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (ashsVar.e(fastJsonResponse$Field)) {
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
                arwm.s(a);
                i = (i * 31) + a.hashCode();
            }
        }
        return i;
    }

    @Override // defpackage.ashs
    public Object z(String str) {
        return null;
    }
}
