package com.google.android.gms.googlehelp.common;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asng;
import defpackage.asnj;
import defpackage.asnw;
import defpackage.asot;
import defpackage.aspy;
import defpackage.bipv;
import defpackage.biqe;
import defpackage.biqt;
import defpackage.biqu;
import defpackage.bivk;
import defpackage.bivr;
import defpackage.bjaw;
import defpackage.bjdp;
import defpackage.bjeg;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.eplm;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fems;
import defpackage.fhfd;
import defpackage.fhfu;
import defpackage.fhfv;
import defpackage.fhfw;
import defpackage.fhfx;
import defpackage.fhfy;
import defpackage.fhfz;
import defpackage.fhga;
import defpackage.fhgd;
import defpackage.fhgg;
import defpackage.folg;
import defpackage.folt;
import defpackage.fomf;
import defpackage.fomm;
import defpackage.fomy;
import defpackage.fopd;
import defpackage.foqq;
import defpackage.fotn;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HelpConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Set a;
    private static final Object aq;
    public PendingIntent A;
    Boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    String H;
    public String I;
    public String J;
    public String K;
    boolean L;
    ND4CSettings M;
    public String N;
    List O;
    public boolean P;
    public String Q;
    int R;
    public int S;
    public List T;
    public boolean U;
    public String V;
    public eplm W;
    public fems X;
    public Intent Y;
    public List Z;
    public Map aa;
    public boolean ab;
    public String ac;
    public int ad;
    public String ae;
    public float af;
    public long ag;
    public boolean ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public int am;
    public List an;
    public int ao;
    public String b;
    public String c;
    public Account d;
    public String e;
    public Bundle f;
    boolean g;
    public boolean h;
    public List i;
    public fhfx j;
    fhgg k;
    public int l;

    @Deprecated
    public Bundle m;

    @Deprecated
    public Bitmap n;

    @Deprecated
    public byte[] o;

    @Deprecated
    public int p;

    @Deprecated
    public int q;
    String r;
    public Uri s;
    public List t;
    List u;
    boolean v;
    public boolean w;
    public String x;
    public ErrorReport y;
    public ThemeSettings z;
    private static final asot ap = asot.b("gH_HelpConfig", asej.GOOGLE_HELP);
    public static final Parcelable.Creator CREATOR = new biqe();

    static {
        fhfd fhfdVar = fhfd.HANGOUTS;
        fhfd fhfdVar2 = fhfd.CHAT;
        fhfd fhfdVar3 = fhfd.PHONE;
        fhfd fhfdVar4 = fhfd.EMAIL;
        Set e = asnw.e(4, false);
        e.add(fhfdVar);
        e.add(fhfdVar2);
        e.add(fhfdVar3);
        e.add(fhfdVar4);
        a = DesugarCollections.unmodifiableSet(e);
        aq = new Object();
    }

    public HelpConfig() {
        this(null, null, null, null, null, true, true, new ArrayList(), null, null, 0, null, null, null, 0, 0, null, null, new ArrayList(), new ArrayList(), false, false, null, new ErrorReport(), new ThemeSettings(), null, true, -1, false, false, false, false, null, null, null, null, false, null, null, new ArrayList(), false, null, 0, 0, new ArrayList(), false, null, null, null, null, new ArrayList());
    }

    private final void R(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = this.f;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
                return;
            } else {
                this.f = bundle;
                return;
            }
        }
        if (System.nanoTime() - this.ag > folg.a.a().n() * 1000000) {
            if (this.f == null) {
                this.f = new Bundle(1);
            }
            this.f.putString("gms:googlehelp:async_help_psd_failure", "timeout");
            this.F = true;
        }
    }

    private static void S(GoogleHelp googleHelp, Context context) {
        Bundle bundle;
        if ((googleHelp.A || googleHelp.B) && (bundle = googleHelp.d) != null) {
            if (bundle.containsKey("gms:googlehelp:sync_help_psd_collection_time_ms")) {
                bivr.E(138, Long.valueOf(bundle.getString("gms:googlehelp:sync_help_psd_collection_time_ms")).longValue(), googleHelp, context);
                bjaw.v(context, googleHelp, 53, Long.parseLong(bundle.getString("gms:googlehelp:sync_help_psd_collection_time_ms")));
                return;
            }
            if (bundle.containsKey("gms:googlehelp:sync_help_psd_failure")) {
                bivr.D(106, 62, bundle.getString("gms:googlehelp:sync_help_psd_failure"), googleHelp, context);
                return;
            }
            if (bundle.containsKey("gms:googlehelp:async_help_psd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:googlehelp:async_help_psd_failure"))) {
                bivr.C(105, 143, googleHelp, context);
                bjaw.y(context, googleHelp, 63, 60);
            }
            if (bundle.containsKey("gms:feedback:async_feedback_psd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:feedback:async_feedback_psd_failure"))) {
                bivr.C(104, 143, googleHelp, context);
                bjaw.y(context, googleHelp, 64, 60);
            }
            if (bundle.containsKey("gms:feedback:async_feedback_psbd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:feedback:async_feedback_psbd_failure"))) {
                bivr.C(103, 143, googleHelp, context);
                bjaw.y(context, googleHelp, 65, 60);
            }
        }
    }

    static Bundle b(fems femsVar) {
        if (femsVar == null || femsVar.equals(fems.a)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("EXTRA_GSE_SESSION_OPTIONS", femsVar.r());
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.googlehelp.common.HelpConfig d(com.google.android.gms.googlehelp.GoogleHelp r55, android.content.Context r56) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.d(com.google.android.gms.googlehelp.GoogleHelp, android.content.Context):com.google.android.gms.googlehelp.common.HelpConfig");
    }

    public static HelpConfig e(Activity activity, Bundle bundle, Intent intent) {
        HelpConfig helpConfig;
        eplm eplmVar;
        if (bundle != null) {
            HelpConfig helpConfig2 = (HelpConfig) bundle.getParcelable("EXTRA_HELP_CONFIG");
            if (helpConfig2 != null) {
                helpConfig2.P(true, bundle.getLong("EXTRA_START_TICK", System.nanoTime()));
            }
            return helpConfig2;
        }
        if (intent == null) {
            ((ejhf) ap.i()).x("Can't construct HelpConfig; calling intent is null.");
            return null;
        }
        if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) arxd.b(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            S(inProductHelp.a, activity);
            helpConfig = d(inProductHelp.a, activity);
            helpConfig.aj = inProductHelp.b;
            helpConfig.ak = inProductHelp.c;
            helpConfig.R = inProductHelp.d;
            helpConfig.am = inProductHelp.f;
            helpConfig.al = inProductHelp.e;
            if (bivk.b(fomy.c())) {
                String str = inProductHelp.g;
                if (str == null) {
                    eplmVar = eplm.a;
                } else {
                    try {
                        byte[] d = asnj.d(str);
                        fecp y = fecp.y(eplm.a, d, 0, d.length, febw.a());
                        fecp.M(y);
                        eplmVar = (eplm) y;
                    } catch (fedk unused) {
                        eplmVar = eplm.a;
                    }
                }
                helpConfig.W = eplmVar;
            }
        } else if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
            S(googleHelp, activity);
            helpConfig = d(googleHelp, activity);
        } else {
            if (!intent.hasExtra("EXTRA_HELP_CONFIG")) {
                ((ejhf) ap.i()).B("HelpConfig could not be created from intent: %s", intent);
                return null;
            }
            helpConfig = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
        }
        boolean hasExtra = intent.hasExtra("EXTRA_START_TICK");
        helpConfig.P(hasExtra, hasExtra ? intent.getLongExtra("EXTRA_START_TICK", -1L) : System.nanoTime());
        if (TextUtils.isEmpty(helpConfig.b)) {
            String q = asng.q(activity);
            if (TextUtils.isEmpty(q)) {
                ((ejhf) ap.i()).x("Received empty package name, and can't continue. Please fix help integration");
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(folg.z()));
                if (asng.ad(activity, data)) {
                    activity.startActivity(data);
                }
                activity.finish();
                return helpConfig;
            }
            helpConfig.b = q;
        }
        if (bivk.a(fotn.a.a().a()) && intent.hasExtra("EXTRA_CUSTOM_FEEDBACK")) {
            helpConfig.A = (PendingIntent) intent.getParcelableExtra("EXTRA_CUSTOM_FEEDBACK");
        }
        try {
            PackageManager packageManager = activity.getPackageManager();
            helpConfig.ai = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.b, 0));
        } catch (PackageManager.NameNotFoundException e) {
            ((ejhf) ((ejhf) ap.j()).s(e)).B("Fetching ApplicationInfo of %s failed.", helpConfig.b);
        }
        return helpConfig;
    }

    public final boolean A(fhfd fhfdVar) {
        if (fhfdVar == fhfd.PHONE && !this.i.isEmpty()) {
            return true;
        }
        if (this.j == null || !B(fhfdVar)) {
            return false;
        }
        int ordinal = fhfdVar.ordinal();
        if (ordinal == 1) {
            fhfu fhfuVar = this.j.d;
            if (fhfuVar == null) {
                fhfuVar = fhfu.a;
            }
            return fhfuVar.c;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            fhfw fhfwVar = this.j.c;
            if (fhfwVar == null) {
                fhfwVar = fhfw.a;
            }
            return fhfwVar.c;
        }
        if (ordinal != 6) {
            return false;
        }
        fhfv fhfvVar = this.j.e;
        if (fhfvVar == null) {
            fhfvVar = fhfv.a;
        }
        return fhfvVar.b;
    }

    public final boolean B(fhfd fhfdVar) {
        if (this.j == null) {
            return false;
        }
        int ordinal = fhfdVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal == 6 && (this.j.b & 8) != 0 : (this.j.b & 1) != 0 : (this.j.b & 2) != 0 : (this.j.b & 4) != 0;
    }

    public final boolean C() {
        int i = this.am;
        return i == 2 || i == 1 || i == 3 || i == 4;
    }

    public final boolean D() {
        fhfx fhfxVar = this.j;
        if (fhfxVar == null) {
            return false;
        }
        fhgd fhgdVar = fhfxVar.f;
        if (fhgdVar == null) {
            fhgdVar = fhgd.a;
        }
        return (fhgdVar.b & 4) != 0;
    }

    public final boolean E() {
        ND4CSettings nD4CSettings = this.M;
        return nD4CSettings != null && nD4CSettings.a;
    }

    public final boolean F() {
        return !TextUtils.isEmpty(this.ak);
    }

    public final boolean G() {
        return this.R == 2;
    }

    public final boolean H() {
        return !TextUtils.isEmpty(this.aj);
    }

    public final boolean I() {
        return this.R == 1;
    }

    public final boolean J(Context context) {
        List list = this.i;
        if (context != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            int i = aspy.a;
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:".concat(String.valueOf(str))));
            if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean K() {
        return bivk.b(fomf.a.a().a()) && this.L;
    }

    public final boolean L() {
        return bivk.b(fomm.i()) && Boolean.parseBoolean(j(bipv.v)) && v();
    }

    public final boolean M() {
        return (TextUtils.isEmpty(i()) && TextUtils.isEmpty(m())) ? false : true;
    }

    public final boolean N() {
        if (this.w) {
            return true;
        }
        String j = j(bipv.e);
        return !TextUtils.isEmpty(j) ? j.equalsIgnoreCase("top") : this.v;
    }

    public final void O(fhfx fhfxVar) {
        this.j = fhfxVar;
        int i = 0;
        if (folt.a.a().d() && t()) {
            i = 3;
        }
        this.l = i;
    }

    public final void P(boolean z, long j) {
        this.ah = z;
        this.ag = j;
    }

    public final void Q(boolean z) {
        if (bjeg.c(this)) {
            this.U = z;
        }
    }

    public final int a() {
        try {
            return Integer.parseInt(j(bipv.b));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle c(Context context) {
        if (this.D && !this.F) {
            r(context);
        }
        return this.f;
    }

    public final fhfd f() {
        fhfx fhfxVar = this.j;
        if (fhfxVar == null) {
            return fhfd.UNKNOWN_CONTACT_MODE;
        }
        fhgd fhgdVar = fhfxVar.f;
        if (fhgdVar == null) {
            fhgdVar = fhgd.a;
        }
        fhfd b = fhfd.b(fhgdVar.f);
        return b == null ? fhfd.UNKNOWN_CONTACT_MODE : b;
    }

    public final String g() {
        return !TextUtils.isEmpty(this.K) ? this.K : this.b;
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.H)) {
            return this.H;
        }
        if (!s()) {
            return null;
        }
        fhfu fhfuVar = this.j.d;
        if (fhfuVar == null) {
            fhfuVar = fhfu.a;
        }
        return fhfuVar.d;
    }

    public final String i() {
        if (TextUtils.isEmpty(j(bipv.s))) {
            return "";
        }
        return String.valueOf(folg.z()).concat(String.valueOf(j(bipv.s)));
    }

    public final String j(bipv bipvVar) {
        String str = (String) this.aa.get(bipvVar);
        return str != null ? str : bipvVar.y;
    }

    public final String k() {
        fhfx fhfxVar;
        String j = j(bipv.c);
        if (TextUtils.isEmpty(j) && (fhfxVar = this.j) != null && (fhfxVar.b & 4096) != 0) {
            fhga fhgaVar = fhfxVar.i;
            if (fhgaVar == null) {
                fhgaVar = fhga.a;
            }
            j = fhgaVar.c;
        }
        return (bivk.a(fopd.c()) && TextUtils.isEmpty(j)) ? TextUtils.isEmpty(this.J) ? "" : this.J : j;
    }

    public final String l() {
        ND4CSettings nD4CSettings = this.M;
        return nD4CSettings == null ? "" : nD4CSettings.b;
    }

    public final String m() {
        if (TextUtils.isEmpty(j(bipv.r))) {
            return "";
        }
        return String.valueOf(folg.z()).concat(String.valueOf(j(bipv.r)));
    }

    public final String n() {
        return eiif.b(this.V);
    }

    public final List o() {
        if (this.u == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineSuggestion offlineSuggestion : this.u) {
            biqu biquVar = biqu.a;
            biqt biqtVar = new biqt();
            biqtVar.a = offlineSuggestion.a;
            biqtVar.d = 4;
            biqtVar.e = offlineSuggestion.b;
            biqtVar.f = offlineSuggestion.c;
            biqtVar.g = offlineSuggestion.d;
            arrayList.add(biqtVar.a());
        }
        return arrayList;
    }

    public final List p(Context context) {
        Bundle c = c(context);
        if (c == null) {
            return null;
        }
        Set<String> keySet = c.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(keySet.size());
        for (String str : keySet) {
            String string = c.getString(str);
            fecj v = bjdp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            bjdp bjdpVar = (bjdp) fecpVar;
            str.getClass();
            bjdpVar.b |= 1;
            bjdpVar.c = str;
            if (!fecpVar.L()) {
                v.U();
            }
            bjdp bjdpVar2 = (bjdp) v.b;
            string.getClass();
            bjdpVar2.b |= 2;
            bjdpVar2.d = string;
            arrayList.add((bjdp) v.Q());
        }
        return arrayList;
    }

    public final Set q() {
        fhfx fhfxVar = this.j;
        if (fhfxVar != null) {
            fhfy fhfyVar = fhfxVar.g;
            if (fhfyVar == null) {
                fhfyVar = fhfy.a;
            }
            if (fhfyVar.b.size() > 0) {
                Set set = a;
                LinkedHashSet linkedHashSet = new LinkedHashSet(set.size());
                fhfy fhfyVar2 = this.j.g;
                if (fhfyVar2 == null) {
                    fhfyVar2 = fhfy.a;
                }
                int size = fhfyVar2.b.size();
                for (int i = 0; i < size; i++) {
                    fhfy fhfyVar3 = this.j.g;
                    if (fhfyVar3 == null) {
                        fhfyVar3 = fhfy.a;
                    }
                    fhfd b = fhfd.b(fhfyVar3.b.d(i));
                    if (b == null) {
                        b = fhfd.UNKNOWN_CONTACT_MODE;
                    }
                    linkedHashSet.add(b);
                }
                linkedHashSet.addAll(set);
                return linkedHashSet;
            }
        }
        return a;
    }

    public final void r(Context context) {
        String l = bivr.l(this.ag);
        GoogleHelp googleHelp = new GoogleHelp(this.c);
        Account account = this.d;
        if (account != null && !TextUtils.isEmpty(account.name)) {
            googleHelp.c = new Account(this.d.name, "com.google");
        }
        googleHelp.e = this.b;
        googleHelp.D = this.e;
        Bundle d = bivr.d(context, l, googleHelp);
        if (d != null) {
            this.F = true;
        }
        if (!bivk.a(foqq.a.a().b())) {
            R(d);
            return;
        }
        synchronized (aq) {
            R(d);
        }
    }

    public final boolean s() {
        return B(fhfd.CHAT);
    }

    public final boolean t() {
        return !TextUtils.isEmpty(this.N);
    }

    public final boolean u() {
        fhfx fhfxVar = this.j;
        if (fhfxVar == null || (fhfxVar.b & 8192) == 0) {
            return false;
        }
        fhfz fhfzVar = fhfxVar.j;
        if (fhfzVar == null) {
            fhfzVar = fhfz.a;
        }
        return !fhfzVar.c.isEmpty();
    }

    public final boolean v() {
        return this.d != null;
    }

    public final boolean w() {
        return !TextUtils.isEmpty(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        Bundle bundle2;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.g(parcel, 6, this.f, false);
        arxc.e(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.x(parcel, 11, this.i, false);
        arxc.g(parcel, 15, this.m, false);
        arxc.t(parcel, 16, this.n, i, false);
        arxc.v(parcel, 19, this.r, false);
        arxc.t(parcel, 22, this.s, i, false);
        arxc.y(parcel, 23, this.t, false);
        arxc.y(parcel, 25, this.u, false);
        arxc.v(parcel, 31, this.x, false);
        arxc.i(parcel, 32, this.o, false);
        arxc.o(parcel, 33, this.p);
        arxc.o(parcel, 34, this.q);
        fhfx fhfxVar = this.j;
        Bundle bundle3 = null;
        if (fhfxVar == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putByteArray("EXTRA_ESCALATION_OPTIONS", fhfxVar.r());
        }
        arxc.g(parcel, 35, bundle, false);
        arxc.o(parcel, 36, this.l);
        arxc.e(parcel, 38, this.v);
        arxc.t(parcel, 39, this.y, i, false);
        arxc.t(parcel, 41, this.z, i, false);
        arxc.e(parcel, 42, this.w);
        fhgg fhggVar = this.k;
        if (fhggVar == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle();
            bundle2.putByteArray("EXTRA_REALTIME_SUPPORT_STATUS", fhggVar.r());
        }
        arxc.g(parcel, 50, bundle2, false);
        arxc.t(parcel, 52, this.A, i, false);
        arxc.z(parcel, 53, this.B);
        arxc.o(parcel, 56, this.C);
        arxc.e(parcel, 57, this.D);
        arxc.e(parcel, 58, this.E);
        arxc.e(parcel, 59, this.F);
        arxc.e(parcel, 60, this.G);
        arxc.v(parcel, 61, this.H, false);
        arxc.v(parcel, 62, this.I, false);
        arxc.v(parcel, 63, this.J, false);
        arxc.v(parcel, 64, this.K, false);
        arxc.e(parcel, 65, this.L);
        arxc.t(parcel, 66, this.M, i, false);
        arxc.v(parcel, 67, this.N, false);
        arxc.y(parcel, 68, this.O, false);
        arxc.e(parcel, 69, this.P);
        arxc.v(parcel, 70, this.Q, false);
        arxc.o(parcel, 71, this.R);
        arxc.o(parcel, 72, this.S);
        arxc.y(parcel, 73, this.T, false);
        arxc.e(parcel, 74, this.U);
        arxc.v(parcel, 75, this.V, false);
        eplm eplmVar = this.W;
        if (eplmVar != null) {
            bundle3 = new Bundle();
            bundle3.putByteArray("EXTRA_STARTING_FLOW", eplmVar.r());
        }
        arxc.g(parcel, 76, bundle3, false);
        arxc.g(parcel, 77, b(this.X), false);
        arxc.t(parcel, 78, this.Y, i, false);
        arxc.x(parcel, 79, this.Z, false);
        arxc.c(parcel, a2);
    }

    public final boolean x() {
        List list = this.u;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean y() {
        return !TextUtils.isEmpty(this.ac);
    }

    public final boolean z() {
        return this.ag != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HelpConfig(java.lang.String r10, java.lang.String r11, android.accounts.Account r12, java.lang.String r13, android.os.Bundle r14, boolean r15, boolean r16, java.util.List r17, android.os.Bundle r18, android.os.Bundle r19, int r20, android.os.Bundle r21, android.graphics.Bitmap r22, byte[] r23, int r24, int r25, java.lang.String r26, android.net.Uri r27, java.util.List r28, java.util.List r29, boolean r30, boolean r31, java.lang.String r32, com.google.android.gms.feedback.ErrorReport r33, com.google.android.gms.feedback.ThemeSettings r34, android.app.PendingIntent r35, java.lang.Boolean r36, int r37, boolean r38, boolean r39, boolean r40, boolean r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, com.google.android.gms.googlehelp.ND4CSettings r47, java.lang.String r48, java.util.List r49, boolean r50, java.lang.String r51, int r52, int r53, java.util.List r54, boolean r55, java.lang.String r56, android.os.Bundle r57, android.os.Bundle r58, android.content.Intent r59, java.util.List r60) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.<init>(java.lang.String, java.lang.String, android.accounts.Account, java.lang.String, android.os.Bundle, boolean, boolean, java.util.List, android.os.Bundle, android.os.Bundle, int, android.os.Bundle, android.graphics.Bitmap, byte[], int, int, java.lang.String, android.net.Uri, java.util.List, java.util.List, boolean, boolean, java.lang.String, com.google.android.gms.feedback.ErrorReport, com.google.android.gms.feedback.ThemeSettings, android.app.PendingIntent, java.lang.Boolean, int, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.google.android.gms.googlehelp.ND4CSettings, java.lang.String, java.util.List, boolean, java.lang.String, int, int, java.util.List, boolean, java.lang.String, android.os.Bundle, android.os.Bundle, android.content.Intent, java.util.List):void");
    }
}
