package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.atzr;
import defpackage.bcjm;
import defpackage.bktj;
import defpackage.bktn;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bktn();
    public boolean A;
    public boolean B;
    public int C;
    public String D;
    public boolean E;
    public String F;
    public boolean G;
    public ND4CSettings H;
    public boolean I;
    public List J;

    @Deprecated
    public String K;
    public int L;
    public int M;
    public List N;
    public String O;
    public Intent P;
    public List Q;
    public bktj R;
    public bcjm S;
    final int a;
    public String b;
    public Account c;
    public Bundle d;
    public String e;
    String f;
    Bitmap g;
    public boolean h;
    public boolean i;
    public List j;

    @Deprecated
    public Bundle k;

    @Deprecated
    public Bitmap l;

    @Deprecated
    public byte[] m;

    @Deprecated
    public int n;

    @Deprecated
    public int o;
    public String p;
    public Uri q;
    public List r;
    public ThemeSettings s;
    public List t;
    public boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    public PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            Log.e("gH_GoogleHelp", "Help requires a non-empty appContext. Please fix ASAP.");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.a = i4;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final void b(Context context) {
        this.f = context.getString(R.string.common_google_settings);
        this.g = BitmapFactory.decodeResource(context.getResources(), 2131231470);
    }

    public final void c() {
        this.y = null;
    }

    public final void d(FeedbackOptions feedbackOptions, File file) {
        this.S = feedbackOptions.t;
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.v = errorReport;
        errorReport.X = "GoogleHelp";
    }

    @Deprecated
    public final void e(Map map) {
        this.d = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            this.d.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.g(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.h);
        atzr.e(parcel, 6, this.i);
        atzr.x(parcel, 7, this.j, false);
        atzr.g(parcel, 10, this.k, false);
        atzr.t(parcel, 11, this.l, i, false);
        atzr.v(parcel, 14, this.p, false);
        atzr.t(parcel, 15, this.q, i, false);
        atzr.y(parcel, 16, this.r, false);
        atzr.o(parcel, 17, 0);
        atzr.y(parcel, 18, this.t, false);
        atzr.i(parcel, 19, this.m, false);
        atzr.o(parcel, 20, this.n);
        atzr.o(parcel, 21, this.o);
        atzr.e(parcel, 22, this.u);
        atzr.t(parcel, 23, this.v, i, false);
        atzr.t(parcel, 25, this.s, i, false);
        atzr.v(parcel, 28, this.e, false);
        atzr.t(parcel, 31, this.w, i, false);
        atzr.o(parcel, 32, this.x);
        atzr.t(parcel, 33, this.y, i, false);
        atzr.v(parcel, 34, this.f, false);
        atzr.t(parcel, 35, this.g, i, false);
        atzr.o(parcel, 36, this.z);
        atzr.e(parcel, 37, this.A);
        atzr.e(parcel, 38, this.B);
        atzr.o(parcel, 39, this.C);
        atzr.v(parcel, 40, this.D, false);
        atzr.e(parcel, 41, this.E);
        atzr.v(parcel, 42, this.F, false);
        atzr.e(parcel, 43, this.G);
        atzr.t(parcel, 44, this.H, i, false);
        atzr.e(parcel, 45, this.I);
        atzr.y(parcel, 46, this.J, false);
        atzr.v(parcel, 47, this.K, false);
        atzr.o(parcel, 48, this.L);
        atzr.o(parcel, 49, this.M);
        atzr.y(parcel, 50, this.N, false);
        atzr.v(parcel, 51, this.O, false);
        atzr.t(parcel, 52, this.P, i, false);
        atzr.x(parcel, 53, this.Q, false);
        atzr.c(parcel, a);
    }

    @Deprecated
    public GoogleHelp(String str) {
        this(23, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
    }
}
