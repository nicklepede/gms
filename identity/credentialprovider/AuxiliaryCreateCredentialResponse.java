package com.google.android.gms.identity.credentialprovider;

import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bmil;
import defpackage.fuwt;
import defpackage.fvbo;
import defpackage.izj;
import defpackage.izk;
import defpackage.jaz;
import defpackage.jbs;
import defpackage.jbt;
import defpackage.jcl;
import defpackage.jcm;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuxiliaryCreateCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmil();
    public final String a;
    public final jaz b;
    public final izk c;

    public AuxiliaryCreateCredentialResponse(String str, jaz jazVar, izk izkVar) {
        arwm.c((jazVar == null) ^ (izkVar == null), "Exactly one of response or exception can be set");
        arwm.c((str == null && izkVar == null) ? false : true, "fullyQualifiedServiceName can only be null when exception is not null");
        this.a = str;
        this.b = jazVar;
        this.c = izkVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryCreateCredentialResponse) {
            AuxiliaryCreateCredentialResponse auxiliaryCreateCredentialResponse = (AuxiliaryCreateCredentialResponse) obj;
            if (arwb.b(this.a, auxiliaryCreateCredentialResponse.a) && arwb.b(this.c, auxiliaryCreateCredentialResponse.c) && arwb.b(this.b, auxiliaryCreateCredentialResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        Instant instant;
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        jaz jazVar = this.b;
        if (jazVar == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            List list = jazVar.a;
            fvbo.f(list, "<this>");
            bundle.putInt("androidx.credentials.provider.extra.CREATE_ENTRY_SIZE", list.size());
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    fuwt.k();
                }
                jbt jbtVar = (jbt) obj;
                bundle.putCharSequence(a.j(i2, "androidx.credentials.provider.extra.ACCOUNT_NAME_"), jbtVar.a);
                bundle.putParcelable(a.j(i2, "androidx.credentials.provider.extra.PENDING_INTENT_"), jbtVar.b);
                Icon icon = jbtVar.c;
                if (icon != null) {
                    bundle.putParcelable(a.j(i2, "androidx.credentials.provider.extra.ICON_"), icon);
                }
                CharSequence charSequence = jbtVar.d;
                if (charSequence != null) {
                    bundle.putCharSequence(a.j(i2, "androidx.credentials.provider.extra.DESCRIPTION_"), charSequence);
                }
                if (Build.VERSION.SDK_INT >= 26 && (instant = jbtVar.e) != null) {
                    bundle.putSerializable(a.j(i2, "androidx.credentials.provider.extra.LAST_USED_TIME_"), instant);
                }
                Bundle a2 = jbs.a(jbtVar.f);
                if (a2 != null) {
                    bundle.putBundle(a.j(i2, "androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_"), a2);
                }
                bundle.putBoolean(a.j(i2, "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_"), jbtVar.g);
                i2 = i3;
            }
            jcm jcmVar = jazVar.b;
            if (jcmVar != null) {
                jcl.a(jcmVar, bundle);
            }
        }
        arxc.g(parcel, 3, bundle, false);
        izk izkVar = this.c;
        arxc.g(parcel, 4, izkVar != null ? izj.a(izkVar) : null, false);
        arxc.c(parcel, a);
    }
}
