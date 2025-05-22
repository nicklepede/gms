package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acxt;
import defpackage.adau;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acxt();
    String a;
    List b;
    String c;
    CaptchaChallenge d;

    public AccountNameCheckResponse(String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = captchaChallenge;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.x(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }

    public AccountNameCheckResponse(adau adauVar) {
        this(adauVar, (String) null, (CaptchaChallenge) null, Collections.EMPTY_LIST);
    }

    public AccountNameCheckResponse(adau adauVar, String str, CaptchaChallenge captchaChallenge, List list) {
        atzb.s(adauVar);
        this.a = adauVar.ak;
        this.c = str;
        this.d = captchaChallenge;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
