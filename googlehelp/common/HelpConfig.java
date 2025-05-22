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
import defpackage.atzr;
import defpackage.atzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.aurd;
import defpackage.aurq;
import defpackage.ausn;
import defpackage.auts;
import defpackage.bkuk;
import defpackage.bkut;
import defpackage.bkvi;
import defpackage.bkvj;
import defpackage.bkzz;
import defpackage.blag;
import defpackage.blfl;
import defpackage.blie;
import defpackage.bliv;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.erzl;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fhbl;
import defpackage.fjva;
import defpackage.fjvr;
import defpackage.fjvs;
import defpackage.fjvt;
import defpackage.fjvu;
import defpackage.fjvv;
import defpackage.fjvw;
import defpackage.fjvx;
import defpackage.fjwa;
import defpackage.fjwd;
import defpackage.frdz;
import defpackage.frem;
import defpackage.frey;
import defpackage.frff;
import defpackage.frfr;
import defpackage.frhw;
import defpackage.frjj;
import defpackage.frmg;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public erzl W;
    public fhbl X;
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
    public fjvu j;
    fjwd k;
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
    private static final ausn ap = ausn.b("gH_HelpConfig", auid.GOOGLE_HELP);
    public static final Parcelable.Creator CREATOR = new bkut();

    static {
        fjva fjvaVar = fjva.HANGOUTS;
        fjva fjvaVar2 = fjva.CHAT;
        fjva fjvaVar3 = fjva.PHONE;
        fjva fjvaVar4 = fjva.EMAIL;
        Set e = aurq.e(4, false);
        e.add(fjvaVar);
        e.add(fjvaVar2);
        e.add(fjvaVar3);
        e.add(fjvaVar4);
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
        if (System.nanoTime() - this.ag > frdz.a.lK().n() * 1000000) {
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
                blag.E(138, Long.valueOf(bundle.getString("gms:googlehelp:sync_help_psd_collection_time_ms")).longValue(), googleHelp, context);
                blfl.v(context, googleHelp, 53, Long.parseLong(bundle.getString("gms:googlehelp:sync_help_psd_collection_time_ms")));
                return;
            }
            if (bundle.containsKey("gms:googlehelp:sync_help_psd_failure")) {
                blag.D(106, 62, bundle.getString("gms:googlehelp:sync_help_psd_failure"), googleHelp, context);
                return;
            }
            if (bundle.containsKey("gms:googlehelp:async_help_psd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:googlehelp:async_help_psd_failure"))) {
                blag.C(105, 143, googleHelp, context);
                blfl.y(context, googleHelp, 63, 60);
            }
            if (bundle.containsKey("gms:feedback:async_feedback_psd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:feedback:async_feedback_psd_failure"))) {
                blag.C(104, 143, googleHelp, context);
                blfl.y(context, googleHelp, 64, 60);
            }
            if (bundle.containsKey("gms:feedback:async_feedback_psbd_failure") && TextUtils.equals("null_api_client", bundle.getString("gms:feedback:async_feedback_psbd_failure"))) {
                blag.C(103, 143, googleHelp, context);
                blfl.y(context, googleHelp, 65, 60);
            }
        }
    }

    static Bundle b(fhbl fhblVar) {
        if (fhblVar == null || fhblVar.equals(fhbl.a)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("EXTRA_GSE_SESSION_OPTIONS", fhblVar.r());
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
        erzl erzlVar;
        if (bundle != null) {
            HelpConfig helpConfig2 = (HelpConfig) bundle.getParcelable("EXTRA_HELP_CONFIG");
            if (helpConfig2 != null) {
                helpConfig2.P(true, bundle.getLong("EXTRA_START_TICK", System.nanoTime()));
            }
            return helpConfig2;
        }
        if (intent == null) {
            ((eluo) ap.i()).x("Can't construct HelpConfig; calling intent is null.");
            return null;
        }
        if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) atzs.b(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            S(inProductHelp.a, activity);
            helpConfig = d(inProductHelp.a, activity);
            helpConfig.aj = inProductHelp.b;
            helpConfig.ak = inProductHelp.c;
            helpConfig.R = inProductHelp.d;
            helpConfig.am = inProductHelp.f;
            helpConfig.al = inProductHelp.e;
            if (bkzz.b(frfr.c())) {
                String str = inProductHelp.g;
                if (str == null) {
                    erzlVar = erzl.a;
                } else {
                    try {
                        byte[] d = aurd.d(str);
                        fgri y = fgri.y(erzl.a, d, 0, d.length, fgqp.a());
                        fgri.M(y);
                        erzlVar = (erzl) y;
                    } catch (fgsd unused) {
                        erzlVar = erzl.a;
                    }
                }
                helpConfig.W = erzlVar;
            }
        } else if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
            S(googleHelp, activity);
            helpConfig = d(googleHelp, activity);
        } else {
            if (!intent.hasExtra("EXTRA_HELP_CONFIG")) {
                ((eluo) ap.i()).B("HelpConfig could not be created from intent: %s", intent);
                return null;
            }
            helpConfig = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
        }
        boolean hasExtra = intent.hasExtra("EXTRA_START_TICK");
        helpConfig.P(hasExtra, hasExtra ? intent.getLongExtra("EXTRA_START_TICK", -1L) : System.nanoTime());
        if (TextUtils.isEmpty(helpConfig.b)) {
            String q = aura.q(activity);
            if (TextUtils.isEmpty(q)) {
                ((eluo) ap.i()).x("Received empty package name, and can't continue. Please fix help integration");
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(frdz.z()));
                if (aura.ad(activity, data)) {
                    activity.startActivity(data);
                }
                activity.finish();
                return helpConfig;
            }
            helpConfig.b = q;
        }
        if (bkzz.a(frmg.a.lK().a()) && intent.hasExtra("EXTRA_CUSTOM_FEEDBACK")) {
            helpConfig.A = (PendingIntent) intent.getParcelableExtra("EXTRA_CUSTOM_FEEDBACK");
        }
        try {
            PackageManager packageManager = activity.getPackageManager();
            helpConfig.ai = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.b, 0));
        } catch (PackageManager.NameNotFoundException e) {
            ((eluo) ((eluo) ap.j()).s(e)).B("Fetching ApplicationInfo of %s failed.", helpConfig.b);
        }
        return helpConfig;
    }

    public final boolean A(fjva fjvaVar) {
        if (fjvaVar == fjva.PHONE && !this.i.isEmpty()) {
            return true;
        }
        if (this.j == null || !B(fjvaVar)) {
            return false;
        }
        int ordinal = fjvaVar.ordinal();
        if (ordinal == 1) {
            fjvr fjvrVar = this.j.d;
            if (fjvrVar == null) {
                fjvrVar = fjvr.a;
            }
            return fjvrVar.c;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            fjvt fjvtVar = this.j.c;
            if (fjvtVar == null) {
                fjvtVar = fjvt.a;
            }
            return fjvtVar.c;
        }
        if (ordinal != 6) {
            return false;
        }
        fjvs fjvsVar = this.j.e;
        if (fjvsVar == null) {
            fjvsVar = fjvs.a;
        }
        return fjvsVar.b;
    }

    public final boolean B(fjva fjvaVar) {
        if (this.j == null) {
            return false;
        }
        int ordinal = fjvaVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal == 6 && (this.j.b & 8) != 0 : (this.j.b & 1) != 0 : (this.j.b & 2) != 0 : (this.j.b & 4) != 0;
    }

    public final boolean C() {
        int i = this.am;
        return i == 2 || i == 1 || i == 3 || i == 4;
    }

    public final boolean D() {
        fjvu fjvuVar = this.j;
        if (fjvuVar == null) {
            return false;
        }
        fjwa fjwaVar = fjvuVar.f;
        if (fjwaVar == null) {
            fjwaVar = fjwa.a;
        }
        return (fjwaVar.b & 4) != 0;
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
            int i = auts.a;
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:".concat(String.valueOf(str))));
            if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean K() {
        return bkzz.b(frey.a.lK().a()) && this.L;
    }

    public final boolean L() {
        return bkzz.b(frff.i()) && Boolean.parseBoolean(j(bkuk.v)) && v();
    }

    public final boolean M() {
        return (TextUtils.isEmpty(i()) && TextUtils.isEmpty(m())) ? false : true;
    }

    public final boolean N() {
        if (this.w) {
            return true;
        }
        String j = j(bkuk.e);
        return !TextUtils.isEmpty(j) ? j.equalsIgnoreCase("top") : this.v;
    }

    public final void O(fjvu fjvuVar) {
        this.j = fjvuVar;
        int i = 0;
        if (frem.a.lK().d() && t()) {
            i = 3;
        }
        this.l = i;
    }

    public final void P(boolean z, long j) {
        this.ah = z;
        this.ag = j;
    }

    public final void Q(boolean z) {
        if (bliv.c(this)) {
            this.U = z;
        }
    }

    public final int a() {
        try {
            return Integer.parseInt(j(bkuk.b));
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

    public final fjva f() {
        fjvu fjvuVar = this.j;
        if (fjvuVar == null) {
            return fjva.UNKNOWN_CONTACT_MODE;
        }
        fjwa fjwaVar = fjvuVar.f;
        if (fjwaVar == null) {
            fjwaVar = fjwa.a;
        }
        fjva b = fjva.b(fjwaVar.f);
        return b == null ? fjva.UNKNOWN_CONTACT_MODE : b;
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
        fjvr fjvrVar = this.j.d;
        if (fjvrVar == null) {
            fjvrVar = fjvr.a;
        }
        return fjvrVar.d;
    }

    public final String i() {
        bkuk bkukVar = bkuk.s;
        return TextUtils.isEmpty(j(bkukVar)) ? "" : frdz.z().concat(String.valueOf(j(bkukVar)));
    }

    public final String j(bkuk bkukVar) {
        String str = (String) this.aa.get(bkukVar);
        return str != null ? str : bkukVar.y;
    }

    public final String k() {
        fjvu fjvuVar;
        String j = j(bkuk.c);
        if (TextUtils.isEmpty(j) && (fjvuVar = this.j) != null && (fjvuVar.b & 4096) != 0) {
            fjvx fjvxVar = fjvuVar.i;
            if (fjvxVar == null) {
                fjvxVar = fjvx.a;
            }
            j = fjvxVar.c;
        }
        return (bkzz.a(frhw.c()) && TextUtils.isEmpty(j)) ? TextUtils.isEmpty(this.J) ? "" : this.J : j;
    }

    public final String l() {
        ND4CSettings nD4CSettings = this.M;
        return nD4CSettings == null ? "" : nD4CSettings.b;
    }

    public final String m() {
        bkuk bkukVar = bkuk.r;
        return TextUtils.isEmpty(j(bkukVar)) ? "" : frdz.z().concat(String.valueOf(j(bkukVar)));
    }

    public final String n() {
        return ekvk.b(this.V);
    }

    public final List o() {
        if (this.u == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineSuggestion offlineSuggestion : this.u) {
            bkvj bkvjVar = bkvj.a;
            bkvi bkviVar = new bkvi();
            bkviVar.a = offlineSuggestion.a;
            bkviVar.d = 4;
            bkviVar.e = offlineSuggestion.b;
            bkviVar.f = offlineSuggestion.c;
            bkviVar.g = offlineSuggestion.d;
            arrayList.add(bkviVar.a());
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
            fgrc v = blie.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            blie blieVar = (blie) fgriVar;
            str.getClass();
            blieVar.b |= 1;
            blieVar.c = str;
            if (!fgriVar.L()) {
                v.U();
            }
            blie blieVar2 = (blie) v.b;
            string.getClass();
            blieVar2.b |= 2;
            blieVar2.d = string;
            arrayList.add((blie) v.Q());
        }
        return arrayList;
    }

    public final Set q() {
        fjvu fjvuVar = this.j;
        if (fjvuVar != null) {
            fjvv fjvvVar = fjvuVar.g;
            if (fjvvVar == null) {
                fjvvVar = fjvv.a;
            }
            if (fjvvVar.b.size() > 0) {
                Set set = a;
                LinkedHashSet linkedHashSet = new LinkedHashSet(set.size());
                fjvv fjvvVar2 = this.j.g;
                if (fjvvVar2 == null) {
                    fjvvVar2 = fjvv.a;
                }
                int size = fjvvVar2.b.size();
                for (int i = 0; i < size; i++) {
                    fjvv fjvvVar3 = this.j.g;
                    if (fjvvVar3 == null) {
                        fjvvVar3 = fjvv.a;
                    }
                    fjva b = fjva.b(fjvvVar3.b.d(i));
                    if (b == null) {
                        b = fjva.UNKNOWN_CONTACT_MODE;
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
        String l = blag.l(this.ag);
        GoogleHelp googleHelp = new GoogleHelp(this.c);
        Account account = this.d;
        if (account != null && !TextUtils.isEmpty(account.name)) {
            googleHelp.c = new Account(this.d.name, "com.google");
        }
        googleHelp.e = this.b;
        googleHelp.D = this.e;
        Bundle d = blag.d(context, l, googleHelp);
        if (d != null) {
            this.F = true;
        }
        if (!bkzz.a(frjj.a.lK().b())) {
            R(d);
            return;
        }
        synchronized (aq) {
            R(d);
        }
    }

    public final boolean s() {
        return B(fjva.CHAT);
    }

    public final boolean t() {
        return !TextUtils.isEmpty(this.N);
    }

    public final boolean u() {
        fjvu fjvuVar = this.j;
        if (fjvuVar == null || (fjvuVar.b & 8192) == 0) {
            return false;
        }
        fjvw fjvwVar = fjvuVar.j;
        if (fjvwVar == null) {
            fjvwVar = fjvw.a;
        }
        return !fjvwVar.c.isEmpty();
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
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.g(parcel, 6, this.f, false);
        atzr.e(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.x(parcel, 11, this.i, false);
        atzr.g(parcel, 15, this.m, false);
        atzr.t(parcel, 16, this.n, i, false);
        atzr.v(parcel, 19, this.r, false);
        atzr.t(parcel, 22, this.s, i, false);
        atzr.y(parcel, 23, this.t, false);
        atzr.y(parcel, 25, this.u, false);
        atzr.v(parcel, 31, this.x, false);
        atzr.i(parcel, 32, this.o, false);
        atzr.o(parcel, 33, this.p);
        atzr.o(parcel, 34, this.q);
        fjvu fjvuVar = this.j;
        Bundle bundle3 = null;
        if (fjvuVar == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putByteArray("EXTRA_ESCALATION_OPTIONS", fjvuVar.r());
        }
        atzr.g(parcel, 35, bundle, false);
        atzr.o(parcel, 36, this.l);
        atzr.e(parcel, 38, this.v);
        atzr.t(parcel, 39, this.y, i, false);
        atzr.t(parcel, 41, this.z, i, false);
        atzr.e(parcel, 42, this.w);
        fjwd fjwdVar = this.k;
        if (fjwdVar == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle();
            bundle2.putByteArray("EXTRA_REALTIME_SUPPORT_STATUS", fjwdVar.r());
        }
        atzr.g(parcel, 50, bundle2, false);
        atzr.t(parcel, 52, this.A, i, false);
        atzr.z(parcel, 53, this.B);
        atzr.o(parcel, 56, this.C);
        atzr.e(parcel, 57, this.D);
        atzr.e(parcel, 58, this.E);
        atzr.e(parcel, 59, this.F);
        atzr.e(parcel, 60, this.G);
        atzr.v(parcel, 61, this.H, false);
        atzr.v(parcel, 62, this.I, false);
        atzr.v(parcel, 63, this.J, false);
        atzr.v(parcel, 64, this.K, false);
        atzr.e(parcel, 65, this.L);
        atzr.t(parcel, 66, this.M, i, false);
        atzr.v(parcel, 67, this.N, false);
        atzr.y(parcel, 68, this.O, false);
        atzr.e(parcel, 69, this.P);
        atzr.v(parcel, 70, this.Q, false);
        atzr.o(parcel, 71, this.R);
        atzr.o(parcel, 72, this.S);
        atzr.y(parcel, 73, this.T, false);
        atzr.e(parcel, 74, this.U);
        atzr.v(parcel, 75, this.V, false);
        erzl erzlVar = this.W;
        if (erzlVar != null) {
            bundle3 = new Bundle();
            bundle3.putByteArray("EXTRA_STARTING_FLOW", erzlVar.r());
        }
        atzr.g(parcel, 76, bundle3, false);
        atzr.g(parcel, 77, b(this.X), false);
        atzr.t(parcel, 78, this.Y, i, false);
        atzr.x(parcel, 79, this.Z, false);
        atzr.c(parcel, a2);
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
