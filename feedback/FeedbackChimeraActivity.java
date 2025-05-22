package com.google.android.gms.feedback;

import android.accounts.Account;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.util.StateSet;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.common.ui.URLSpanNoUnderline;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.material.card.MaterialCardView;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atwh;
import defpackage.auid;
import defpackage.auio;
import defpackage.aumo;
import defpackage.aupz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auts;
import defpackage.bckm;
import defpackage.bcko;
import defpackage.bckp;
import defpackage.bckr;
import defpackage.bcmi;
import defpackage.bcmk;
import defpackage.bcmm;
import defpackage.bcmn;
import defpackage.bcmo;
import defpackage.bcmp;
import defpackage.bcmq;
import defpackage.bcmr;
import defpackage.bcmw;
import defpackage.bcmx;
import defpackage.bcnl;
import defpackage.bcnm;
import defpackage.bcnt;
import defpackage.bcnv;
import defpackage.bcnw;
import defpackage.bcnx;
import defpackage.bcoc;
import defpackage.bcoh;
import defpackage.bcol;
import defpackage.bcou;
import defpackage.bcov;
import defpackage.bcow;
import defpackage.bcox;
import defpackage.bcoy;
import defpackage.bcoz;
import defpackage.bcpa;
import defpackage.bcpb;
import defpackage.bcpg;
import defpackage.bcpj;
import defpackage.bcpr;
import defpackage.bcpv;
import defpackage.bcpw;
import defpackage.bcqc;
import defpackage.bcsc;
import defpackage.bcsg;
import defpackage.bcsk;
import defpackage.bcsn;
import defpackage.bcst;
import defpackage.bctb;
import defpackage.bctg;
import defpackage.bkug;
import defpackage.bkvj;
import defpackage.bkzy;
import defpackage.bkzz;
import defpackage.blad;
import defpackage.blag;
import defpackage.blah;
import defpackage.bp;
import defpackage.caqj;
import defpackage.dyku;
import defpackage.dyky;
import defpackage.edxt;
import defpackage.edzp;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.esal;
import defpackage.esbj;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgub;
import defpackage.fmht;
import defpackage.fmib;
import defpackage.fmiy;
import defpackage.fmiz;
import defpackage.fmjb;
import defpackage.fmjc;
import defpackage.fmjd;
import defpackage.fmje;
import defpackage.fqfu;
import defpackage.fqgk;
import defpackage.fqgq;
import defpackage.fqhd;
import defpackage.fqhm;
import defpackage.fqhp;
import defpackage.fqhy;
import defpackage.fqib;
import defpackage.fqik;
import defpackage.fqin;
import defpackage.fqit;
import defpackage.fqjf;
import defpackage.fqjx;
import defpackage.fqks;
import defpackage.fqlq;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.frfu;
import defpackage.fywe;
import defpackage.fywh;
import defpackage.ig;
import defpackage.ion;
import defpackage.ip;
import defpackage.irl;
import defpackage.rxx;
import defpackage.sun;
import defpackage.wjw;
import defpackage.wkg;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FeedbackChimeraActivity extends rxx implements MenuItem.OnMenuItemClickListener, bcpv, bcmw, bckr, bcnw, bcnm, blad {
    public static bcnl k;
    public static Bitmap l;
    public static List m;
    public static HelpConfig n;
    public static bkvj o;
    public static sun p;
    private KeyguardManager C;
    private aca D;
    private ServiceConnection E;
    private String F;
    public bcmx r;
    public Map s;
    public Bitmap u;
    public String v;
    public View x;
    public bctb y;
    public String z;
    public static final ausn j = ausn.b("gf_FeedbackActivity", auid.FEEDBACK);
    public static boolean q = false;
    private final eqgo B = new aupz(Integer.MAX_VALUE, 10);
    public boolean t = false;
    public boolean w = false;
    public boolean A = false;

    public static boolean W() {
        return l != null;
    }

    static final boolean ab(ErrorReport errorReport) {
        return fqjf.a.lK().a() && !errorReport.E;
    }

    static final boolean ac(ErrorReport errorReport) {
        fqfu fqfuVar = fqfu.a;
        if (fqfuVar.lK().I() && !errorReport.E) {
            String str = errorReport.a.packageName;
            String B = fqfuVar.lK().B();
            int i = errorReport.a.type;
            String F = fqfuVar.lK().F();
            if (str != null) {
                for (String str2 : blag.y(B)) {
                    if (str.startsWith(str2) && !TextUtils.isEmpty(str2)) {
                        return blag.x(Integer.toString(i), F);
                    }
                }
            }
        }
        return false;
    }

    public static final fgub af() {
        long currentTimeMillis = System.currentTimeMillis();
        fgrc v = fgub.a.v();
        long j2 = currentTimeMillis / 1000;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ((fgub) fgriVar).b = j2;
        long j3 = currentTimeMillis % 1000;
        if (!fgriVar.L()) {
            v.U();
        }
        ((fgub) v.b).c = (int) (j3 * 1000000);
        return (fgub) v.Q();
    }

    public static final fmjd ag(String str, String str2) {
        Locale g = irl.a(Resources.getSystem().getConfiguration()).g(0);
        String languageTag = g != null ? g.toLanguageTag() : "en";
        String a = bcsn.a();
        fgrc v = fmjd.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fmjd fmjdVar = (fmjd) v.b;
        str.getClass();
        fmjdVar.b |= 1;
        fmjdVar.c = str;
        boolean c = fqks.c();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fmjd fmjdVar2 = (fmjd) fgriVar;
        fmjdVar2.b |= 32;
        fmjdVar2.h = c;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        fmjd fmjdVar3 = (fmjd) fgriVar2;
        languageTag.getClass();
        fmjdVar3.b |= 2;
        fmjdVar3.d = languageTag;
        if (!fgriVar2.L()) {
            v.U();
        }
        fmjd fmjdVar4 = (fmjd) v.b;
        fmjdVar4.b |= 4;
        fmjdVar4.e = a;
        String e = fqhd.a.lK().e();
        if (!v.b.L()) {
            v.U();
        }
        fmjd fmjdVar5 = (fmjd) v.b;
        fmjdVar5.b |= 8;
        fmjdVar5.f = e;
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fmjd fmjdVar6 = (fmjd) v.b;
            str2.getClass();
            fmjdVar6.b |= 16;
            fmjdVar6.g = str2;
        }
        return (fmjd) v.Q();
    }

    public static final boolean ah(fgub fgubVar) {
        return af().b - fgubVar.b < fqhd.b();
    }

    private final esbj aj(ErrorReport errorReport) {
        fmiz fmizVar = ((fmje) this.s.get(ag(errorReport.a.packageName, errorReport.P))).d;
        if (fmizVar == null) {
            fmizVar = fmiz.a;
        }
        esbj esbjVar = fmizVar.c;
        return esbjVar == null ? esbj.a : esbjVar;
    }

    private final fmiy ak(String str, String str2) {
        fmjd ag = ag(str, str2);
        fgrc v = fmht.a.v();
        String str3 = ag.c;
        if (!v.b.L()) {
            v.U();
        }
        fmht fmhtVar = (fmht) v.b;
        str3.getClass();
        fmhtVar.b |= 4;
        fmhtVar.c = str3;
        float f = getResources().getDisplayMetrics().density;
        if (!v.b.L()) {
            v.U();
        }
        fmht fmhtVar2 = (fmht) v.b;
        fmhtVar2.b |= 16;
        fmhtVar2.e = f;
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fmht fmhtVar3 = (fmht) v.b;
            str2.getClass();
            fmhtVar3.b |= 8;
            fmhtVar3.d = str2;
        }
        fgrc v2 = fmiy.a.v();
        String str4 = ag.e;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        fmiy fmiyVar = (fmiy) fgriVar;
        str4.getClass();
        fmiyVar.b |= 2;
        fmiyVar.d = str4;
        String str5 = ag.f;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        fmiy fmiyVar2 = (fmiy) fgriVar2;
        str5.getClass();
        fmiyVar2.b |= 4;
        fmiyVar2.e = str5;
        boolean z = ag.h;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fmiy fmiyVar3 = (fmiy) v2.b;
        fmiyVar3.b |= 8;
        fmiyVar3.f = z;
        fgrc v3 = fmib.a.v();
        String str6 = ag.d;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        fmib fmibVar = (fmib) fgriVar3;
        str6.getClass();
        fmibVar.b |= 2;
        fmibVar.e = str6;
        if (!fgriVar3.L()) {
            v3.U();
        }
        fmib fmibVar2 = (fmib) v3.b;
        fmht fmhtVar4 = (fmht) v.Q();
        fmhtVar4.getClass();
        fmibVar2.d = fmhtVar4;
        fmibVar2.c = 2;
        fmib fmibVar3 = (fmib) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        fmiy fmiyVar4 = (fmiy) v2.b;
        fmibVar3.getClass();
        fmiyVar4.c = fmibVar3;
        fmiyVar4.b |= 1;
        return (fmiy) v2.Q();
    }

    private final Map al() {
        try {
            fmjb fmjbVar = (fmjb) new bcko(this).a().get(2L, TimeUnit.SECONDS);
            HashMap hashMap = new HashMap();
            for (fmjc fmjcVar : fmjbVar.b) {
                fmjd fmjdVar = fmjcVar.c;
                if (fmjdVar == null) {
                    fmjdVar = fmjd.a;
                }
                fmje fmjeVar = fmjcVar.d;
                if (fmjeVar == null) {
                    fmjeVar = fmje.a;
                }
                hashMap.put(fmjdVar, fmjeVar);
            }
            return hashMap;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) j.h()).s(e)).ai((char) 3591)).x("Exception occurred while getting config");
            return new HashMap();
        }
    }

    private final void am(String[] strArr, int i, String[] strArr2) {
        for (String str : strArr2) {
            strArr[i] = getString(R.string.common_from) + "  " + str;
            i++;
        }
    }

    private final void an(Intent intent) {
        if (fqhp.c()) {
            bcsk.j(this, w(intent), intent.getBooleanExtra("LAUNCHED_FROM_FEEDBACK_MODULE", false) ? fywe.z : fywe.A, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ao(android.content.Intent r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.FeedbackChimeraActivity.ao(android.content.Intent, boolean):void");
    }

    private final void ap() {
        bcmi bcmiVar = new bcmi(this);
        KeyguardManager keyguardManager = this.C;
        if (keyguardManager != null) {
            keyguardManager.requestDismissKeyguard(getContainerActivity(), bcmiVar);
        }
    }

    private final boolean aq(Intent intent) {
        if (k == null || intent == null) {
            return false;
        }
        ErrorReport w = w(intent);
        ErrorReport b = k.b();
        if (w == null || b == null || TextUtils.isEmpty(w.R) || TextUtils.isEmpty(b.R)) {
            return false;
        }
        return TextUtils.equals(w.R, b.R);
    }

    private final boolean ar() {
        return getPackageManager().hasSystemFeature("android.software.communal_mode");
    }

    private final boolean as(fmjd fmjdVar) {
        if (this.s == null) {
            this.s = al();
        }
        if (!this.s.containsKey(fmjdVar)) {
            return false;
        }
        fgub fgubVar = ((fmje) this.s.get(fmjdVar)).c;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        return ah(fgubVar);
    }

    public static ErrorReport x() {
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            return bcnlVar.b();
        }
        return null;
    }

    @Override // defpackage.bcnm
    public final String A() {
        bcmx bcmxVar = this.r;
        return bcmxVar == null ? "" : ((EditText) ((bcoz) bcmxVar).y(R.id.gf_issue_description)).getText().toString().trim();
    }

    @Override // defpackage.bcnm
    public final String B() {
        return this.v;
    }

    @Override // defpackage.bcmw
    public final void C(CharSequence charSequence) {
        if (k == null) {
            return;
        }
        if (bcnt.e(x())) {
            super.invalidateOptionsMenu();
        }
        k.b().b = charSequence.toString();
    }

    public final void D(int i, int i2, int i3) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(i3);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bcmg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FeedbackChimeraActivity.this.getWindow().getDecorView().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    @Override // defpackage.bcnm
    public final void E() {
        String str;
        int i;
        if (k == null) {
            return;
        }
        ErrorReport w = w(getIntent());
        if (w == null || !bcoc.c(w)) {
            if (!bkzz.a(fqit.a.lK().a()) || (str = this.F) == null) {
                str = this.v;
            }
            bcnl bcnlVar = k;
            String[] strArr = bcnlVar.e;
            int length = strArr.length;
            String[] strArr2 = bcnlVar.f;
            int length2 = strArr2.length;
            int i2 = length + length2;
            String[] strArr3 = new String[i2];
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
                String[] strArr4 = k.e;
                int length3 = strArr4.length;
                i = length3 > 1 ? 1 : 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                while (i3 < length3) {
                    String str2 = strArr4[i3];
                    int i5 = length2;
                    if (!z) {
                        if (true == str2.contains("google.com")) {
                            i = i4;
                        }
                        if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, str)) {
                            z = true;
                            i = i4;
                        }
                    }
                    i4++;
                    i3++;
                    length2 = i5;
                }
            } else {
                i = 0;
            }
            int i6 = length2;
            am(strArr3, 0, strArr);
            if (i6 > 0) {
                am(strArr3, length, strArr2);
            }
            bcmx bcmxVar = this.r;
            if (bcmxVar != null) {
                bcoz bcozVar = (bcoz) bcmxVar;
                Spinner spinner = (Spinner) bcozVar.y(R.id.gf_account_spinner);
                ArrayAdapter arrayAdapter = new ArrayAdapter(bcmxVar.getContext(), R.layout.gf_material_2_spinner, strArr3);
                arrayAdapter.setDropDownViewResource(R.layout.gf_account_spinner_dropdown_item);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner.setOnTouchListener(new bcox());
                spinner.setOnItemSelectedListener(new bcoy(bcozVar));
                if (i2 > 1) {
                    spinner.setSelection(i);
                }
            }
        }
    }

    @Override // defpackage.bcnm
    public final void F(Screenshot screenshot, ErrorReport errorReport) {
        int i;
        int i2;
        if (screenshot == null || TextUtils.isEmpty(screenshot.d)) {
            bcoz bcozVar = (bcoz) this.r;
            ((ImageView) bcozVar.y(R.id.gf_screenshot_icon)).setVisibility(8);
            ((MaterialCardView) bcozVar.y(R.id.gf_include_screenshot_card)).setVisibility(8);
            ((TextView) bcozVar.y(R.id.gf_edit_screenshot)).setVisibility(8);
            return;
        }
        if (errorReport.v == null) {
            i = screenshot.b;
            i2 = screenshot.c;
        } else {
            i = errorReport.x;
            i2 = errorReport.w;
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        Pair a = bcnt.a(getResources(), rect, i, i2, true);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        aura.F(new bcmn(this, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)), screenshot, errorReport, a), new Void[0]);
    }

    @Override // defpackage.blad
    public final void G(Parcelable parcelable) {
        bcnl bcnlVar = k;
        if (bcnlVar == null) {
            ((eluo) ((eluo) j.j()).ai((char) 3599)).x("Session is null, not updating screenshot.");
        } else {
            bcnlVar.s((Screenshot) parcelable);
        }
    }

    @Override // defpackage.bcmw
    public final void H(int i) {
        String concat;
        if (k == null) {
            return;
        }
        String concat2 = String.valueOf(getString(R.string.gf_selection_accessibility_prompt)).concat(" ");
        if (i == 0) {
            this.F = "anonymous";
            k.b().B = "";
            concat = concat2.concat(String.valueOf(getString(R.string.gf_unspecified_email_account)));
        } else {
            bcnl bcnlVar = k;
            String[] strArr = bcnlVar.e;
            int length = strArr.length;
            String str = i < length ? strArr[i] : bcnlVar.f[i - length];
            if (i < length) {
                this.F = str;
            }
            bcnlVar.b().B = str;
            concat = concat2.concat(String.valueOf(str));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            obtain.setPackageName(obtain.getPackageName());
            obtain.setClassName(obtain.getClassName());
            obtain.getText().add(concat);
            obtain.setEnabled(true);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    @Override // defpackage.bcmw
    public final void I(Intent intent) {
        if (intent == null) {
            ((eluo) ((eluo) j.i()).ai((char) 3601)).x("onFragmentResume called with null intent.");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                Bitmap a = this.y.a(stringExtra);
                N(false);
                this.r.x(a, true);
                this.t = false;
                return;
            } catch (RemoteException e) {
                ((eluo) ((eluo) j.i()).ai((char) 3589)).B("Log message : %s", e.getMessage());
                return;
            }
        }
        if (k == null) {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
        }
        bcnl bcnlVar = k;
        if (bcnlVar == null) {
            ((eluo) ((eluo) j.i()).ai((char) 3600)).x("onFragmentResume failed to create a session.");
            return;
        }
        if (this.t) {
            ErrorReport b = bcnlVar.b();
            Screenshot screenshot = k.g;
            bcmx bcmxVar = this.r;
            final bcoz bcozVar = (bcoz) bcmxVar;
            ImageView imageView = (ImageView) bcozVar.y(R.id.gf_screenshot_icon);
            ProgressBar progressBar = (ProgressBar) bcozVar.y(R.id.gf_progress_spinner);
            TextView textView = (TextView) bcozVar.y(R.id.gf_edit_screenshot);
            EditText editText = (EditText) bcozVar.y(R.id.gf_issue_description);
            TextView textView2 = (TextView) bcozVar.y(R.id.gf_view_logs);
            CheckBox checkBox = (CheckBox) bcozVar.y(R.id.gf_include_screenshot);
            CheckBox checkBox2 = (CheckBox) bcozVar.y(R.id.gf_include_logs);
            editText.setText(b.b);
            editText.setSelection(editText.getText().length());
            String string = bcmxVar.getString(R.string.common_view);
            textView2.setLinksClickable(true);
            textView2.setText(string);
            checkBox.setChecked(!b.W);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bcon
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object context = bcoz.this.getContext();
                    if (context instanceof bcmw) {
                        ((bcmw) context).aa();
                    }
                }
            });
            if (bkzz.a(fqik.c())) {
                bcnt.c(checkBox);
            }
            checkBox2.setChecked(!b.W);
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bcoo
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object context = bcoz.this.getContext();
                    if (context instanceof bcmw) {
                        ((bcmw) context).aa();
                    }
                }
            });
            if (bkzz.a(fqik.c())) {
                bcnt.c(checkBox2);
            }
            bcozVar.y(R.id.gf_system_info_card).setOnClickListener(new View.OnClickListener() { // from class: bcop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object context = bcoz.this.getContext();
                    if (context instanceof bcmw) {
                        ((bcmw) context).i();
                    }
                }
            });
            bcozVar.y(R.id.gf_screenshot_card).setOnClickListener(new View.OnClickListener() { // from class: bcoq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object context = bcoz.this.getContext();
                    if (context instanceof bcmw) {
                        ((bcmw) context).j();
                    }
                }
            });
            if (screenshot == null) {
                imageView.setVisibility(8);
                textView.setVisibility(8);
            } else {
                imageView.setMaxHeight(bcmxVar.getResources().getDimensionPixelSize(R.dimen.gf_screenshot_preview_height));
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                progressBar.setVisibility(0);
            }
            Resources resources = bcmxVar.getResources();
            TextView textView3 = (TextView) bcozVar.y(R.id.gf_preview_text);
            String string2 = resources.getString(R.string.gf_legal_request);
            String string3 = resources.getString(R.string.gf_account_system_info);
            String string4 = resources.getString(R.string.common_privacy_policy_composed_string);
            String string5 = resources.getString(R.string.common_terms_of_service_composed_string);
            Spannable a2 = URLSpanNoUnderline.a(Html.fromHtml(resources.getString(R.string.gf_policy, string2, string3, string4, string5)));
            fqfu fqfuVar = fqfu.a;
            blag.t(a2, string2, new bcov(bcozVar, fqfuVar.lK().x()));
            blag.t(a2, string3, new bcou(bcozVar));
            blag.t(a2, string4, new bcow(bcozVar));
            blag.t(a2, string5, new bcov(bcozVar, fqfuVar.lK().D()));
            textView3.setLinksClickable(true);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(a2);
            E();
            if (TextUtils.isEmpty(b.T)) {
                F(screenshot, b);
            }
            Bitmap bitmap = this.u;
            if (bitmap != null) {
                this.r.x(bitmap, R());
            }
            ig hO = hO();
            if (hO != null) {
                hO.A(getString(R.string.gf_send_feedback));
                hO.o(true);
                hO.N();
            }
            N(!(k.m == 3));
            this.t = false;
        }
    }

    @Override // defpackage.bcpv
    public final void J(bcol bcolVar) {
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            bcnlVar.i(bcolVar);
        }
    }

    @Override // defpackage.bcnw
    public final void K(bcnv bcnvVar, ErrorReport errorReport, bcpg bcpgVar) {
        bcnv bcnvVar2;
        bkvj bkvjVar;
        String str;
        String str2;
        if (bcoc.c(errorReport)) {
            if (bcpgVar != null) {
                bcpgVar.dismiss();
            }
            if (bcnvVar != null) {
                k.a().h(esal.CLIENT_REFERENCE_IS_JUNK, true != bcnvVar.c ? "false" : "true");
            }
            k.m(esal.CLIENT_REFERENCE_JUNK_ASYNC);
            return;
        }
        if (ab(errorReport)) {
            bcnl bcnlVar = k;
            if (bcnlVar.c && (str2 = bcnlVar.d) != null && !errorReport.b.equals(str2)) {
                ae(129, errorReport);
            }
        }
        if (bcnvVar == null) {
            bcnvVar2 = null;
        } else {
            if (bcnvVar.c && !k.c && ab(errorReport)) {
                ae(128, errorReport);
                bcnl bcnlVar2 = k;
                String str3 = errorReport.b;
                bcnlVar2.d = str3;
                bcoh bcohVar = new bcoh();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("description", str3);
                bcohVar.setArguments(bundle);
                bcohVar.show(getSupportFragmentManager(), "junkDialog");
                if (bcpgVar != null) {
                    bcpgVar.dismiss();
                }
                k.c = true;
                return;
            }
            bcnvVar2 = bcnvVar;
        }
        if (!ac(errorReport) || bcnvVar2 == null || (bkvjVar = bcnvVar2.b) == null || (str = bcnvVar2.a) == null) {
            errorReport.ab = false;
            errorReport.H = true;
            bcpj.f(errorReport, this);
            f(errorReport, true);
            return;
        }
        if (bcpgVar != null) {
            bcpgVar.dismiss();
        }
        errorReport.ab = true;
        errorReport.H = false;
        o = bkvjVar;
        bcpr bcprVar = new bcpr();
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("help_response_title", bkvjVar.f);
        bundle2.putCharSequence("help_response_snippet", str);
        if (bkzz.b(fqhy.c())) {
            bundle2.putCharSequence("help_response_prediction_id", bkvjVar.c);
            bundle2.putCharSequence("help_response_reporting_id", bkvjVar.d);
        }
        bcprVar.setArguments(bundle2);
        bcprVar.setCancelable(false);
        bcprVar.show(getSupportFragmentManager(), "suggestionDialog");
        String str4 = errorReport.b;
        bkvj bkvjVar2 = o;
        String str5 = bkvjVar2.g;
        String str6 = bkvjVar2.c;
        String str7 = bkvjVar2.d;
        if (errorReport == null) {
            ((eluo) ((eluo) j.i()).ai((char) 3597)).x("ErrorReport is required to populate MetricsData.");
        } else {
            Account account = TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google");
            ausn ausnVar = bcsk.a;
            if (bkzz.b(fqhy.d()) && bkzz.b(frfu.d())) {
                if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                    ((eluo) ((eluo) bcsk.a.i()).ai(3688)).P("Trying to log MoltronInteraction for ShownFeedbackSuggestion with predictionId: %s, reportingId: %s. Falling back to old metric format.", str6, str7);
                } else {
                    bcsk.h(this, errorReport, 43, account, str5, str4, str6, str7, 2);
                }
            }
            bcsk.g(this, errorReport, 43, account, str5, str4);
        }
        f(errorReport, false);
    }

    @Override // defpackage.bcnm
    public final void L(ErrorReport errorReport) {
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("feedbackUserCtlConsent", String.valueOf(bcnlVar.h.S()));
            bcnlVar.l.b(bundle, false);
        }
        if (auts.b(this) && (ab(errorReport) || ac(errorReport))) {
            n = bcnt.b(errorReport, this);
            AsyncTask a = bcnx.a(this, errorReport);
            if (a != null) {
                aura.F(a, n);
                return;
            }
        }
        bcpj.f(errorReport, this);
        f(errorReport, true);
    }

    public final void M(ErrorReport errorReport, boolean z) {
        if (auts.b(this) && bcnt.e(errorReport)) {
            FeedbackAsyncChimeraService.c(this, errorReport);
        } else {
            new bcpj(this, errorReport).start();
        }
        if (z) {
            if (!bcoc.c(errorReport)) {
                p();
            } else if (k != null) {
                bcpw.f();
            }
        }
    }

    @Override // defpackage.bcnm
    public final void N(boolean z) {
        bcoz bcozVar = (bcoz) this.r;
        bcozVar.y(R.id.gf_progress).setVisibility(true != z ? 4 : 0);
        bcozVar.y(R.id.gf_feedback_view).setVisibility(true != z ? 0 : 4);
    }

    public final void O(Intent intent) {
        this.t = true;
        bcoz.a = false;
        bcoz bcozVar = new bcoz();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_intent", intent);
        bcozVar.setArguments(bundle);
        this.r = bcozVar;
        bp bpVar = new bp(getSupportFragmentManager());
        if (getSupportFragmentManager().h("feedback_fragment") != null) {
            bpVar.z(R.id.feedback_content, this.r, "feedback_fragment");
        } else {
            bpVar.u(R.id.feedback_content, this.r, "feedback_fragment");
        }
        bpVar.a();
    }

    public final void P() {
        String str;
        String b;
        Intent intent = getIntent();
        ErrorReport w = w(intent);
        if (w != null && (b = bcst.b((str = w.a.packageName), fqfu.o())) != null) {
            if (bcst.a(getPackageManager().getPackageInfo(str, 0).versionName, b) <= 0) {
                ae(119, w);
                ErrorReport w2 = w(intent);
                new bcqc(new bcmk(this, w2, intent), w2).show(getSupportFragmentManager(), "UpgradeDialog");
                bkzy.a(this.B, this);
            }
        }
        ae(8, w);
        String stringExtra = intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
        this.z = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.E = new bcmm(this, intent);
            aumo.a().d(this, new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackAsyncService"), this.E, 1);
        } else if (bcoc.c(w)) {
            ao(intent, false);
        } else {
            O(intent);
        }
        bkzy.a(this.B, this);
    }

    public final void Q(bcnl bcnlVar, boolean z) {
        if (bcnlVar.x()) {
            M(bcnlVar.b(), z);
        } else {
            new caqj(Looper.getMainLooper()).postDelayed(new bcmq(this, bcnlVar, z), fqfu.e());
        }
    }

    public final boolean R() {
        return this.w && fqfu.p();
    }

    @Override // defpackage.bcnm
    public final boolean S() {
        return ((CheckBox) ((bcoz) this.r).y(R.id.gf_email_consent_check)).isChecked();
    }

    @Override // defpackage.bcnm
    public final boolean T() {
        bcmx bcmxVar = this.r;
        if (!bkzz.a(fqin.c())) {
            return ((CheckBox) ((bcoz) bcmxVar).y(R.id.gf_include_screenshot)).isChecked();
        }
        CheckBox checkBox = (CheckBox) ((bcoz) bcmxVar).y(R.id.gf_include_screenshot);
        if (checkBox == null || checkBox.getVisibility() != 0) {
            return false;
        }
        return checkBox.isChecked();
    }

    @Override // defpackage.bcnm
    public final boolean U() {
        bcmx bcmxVar = this.r;
        if (!bkzz.a(fqin.c())) {
            return ((CheckBox) ((bcoz) bcmxVar).y(R.id.gf_include_logs)).isChecked();
        }
        CheckBox checkBox = (CheckBox) ((bcoz) bcmxVar).y(R.id.gf_include_logs);
        if (checkBox == null || checkBox.getVisibility() != 0) {
            return false;
        }
        return checkBox.isChecked();
    }

    @Override // defpackage.bcnm
    public final boolean V() {
        return bcoz.a;
    }

    @Override // defpackage.bcnm
    public final boolean X() {
        return bcoc.c(w(getIntent()));
    }

    @Override // defpackage.bcmw
    public final void Z(int i) {
        if (x() == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (x().ac == null) {
            x().ac = new Bundle();
        }
        long j2 = i;
        if (x().ac.getLong("max_char_count_delta") < j2) {
            x().ac.putLong("max_char_count_delta", j2);
        }
        if (x().ac.getLong("input_start_time") == 0) {
            x().ac.putLong("input_start_time", currentTimeMillis);
            x().ac.putLong("input_end_time", currentTimeMillis);
        }
        if (x().ac.getLong("input_end_time") != 0) {
            x().ac.putLong("input_end_time", currentTimeMillis);
        }
    }

    @Override // defpackage.bckr
    public final Activity a() {
        return getContainerActivity();
    }

    @Override // defpackage.bcmw
    public final void aa() {
        bcnl bcnlVar = k;
        if (bcnlVar == null) {
            return;
        }
        bcnlVar.q();
    }

    @Override // defpackage.bcnw
    public final void ad(bcpg bcpgVar) {
        bcpgVar.show(getSupportFragmentManager(), "progress_dialog");
    }

    public final void ae(int i, ErrorReport errorReport) {
        if (errorReport == null) {
            ((eluo) ((eluo) j.i()).ai((char) 3596)).x("ErrorReport is required to populate MetricsData.");
        } else {
            bcsk.g(this, errorReport, i, TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google"), null, null);
        }
    }

    public final void ai(ErrorReport errorReport, int i, esbj esbjVar) {
        if (!fqks.d()) {
            bcsk.j(this, errorReport, fywe.p, 0, i);
            return;
        }
        bcsc bcscVar = new bcsc();
        bcscVar.a = x();
        bcscVar.b(fywe.p);
        bcscVar.m = i;
        bcscVar.h = Integer.valueOf(bcpb.a(esbjVar.c));
        bcscVar.i = Integer.valueOf(bcpb.a(esbjVar.d));
        bcsk.b(this, bcscVar.a());
    }

    @Override // defpackage.bckr
    public final void d() {
        getWindow().getDecorView().setBackgroundColor(q());
    }

    @Override // defpackage.bckr
    public final void e() {
        x();
    }

    @Override // defpackage.bckr
    public final void f(ErrorReport errorReport, boolean z) {
        if (bkzz.b(fqgq.c())) {
            this.B.execute(new bcmp(this, errorReport, z));
            return;
        }
        bcnl bcnlVar = k;
        if (bcnlVar == null || !bcnlVar.u()) {
            M(errorReport, z);
        } else {
            Q(bcnlVar, z);
        }
    }

    @Override // defpackage.bckr
    public final void g(String str, ErrorReport errorReport) {
        if (!fqib.c() || !str.equals(fqfu.n())) {
            bcpa.c(getContainerActivity(), str, errorReport);
            return;
        }
        try {
            dyky.b(this, this.D, errorReport != null ? errorReport.B : "");
        } catch (dyku unused) {
            bcpa.c(getContainerActivity(), fqfu.n(), errorReport);
        }
    }

    @Override // defpackage.bcmw, defpackage.bckr
    public final void i() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    @Override // defpackage.bcmw, defpackage.bckr
    public final void j() {
        ThemeSettings themeSettings;
        Intent intent = new Intent();
        if (R()) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ErrorReport x = x();
            if (x != null && (themeSettings = x.Y) != null && themeSettings.b != 0) {
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", bkug.a(themeSettings));
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    @Override // defpackage.bckr
    public final void k() {
        startActivity(bcpa.a(this));
    }

    @Override // defpackage.bckr
    public final void l() {
        startActivity(bcpa.b(this));
    }

    @Override // defpackage.bckr
    public final void m(Integer num, Integer num2, elgo elgoVar) {
        sun.d(num, num2, elgoVar);
    }

    @Override // defpackage.bckr, defpackage.bcnm
    public final void n(Runnable runnable) {
        runOnUiThread(runnable);
    }

    @Override // defpackage.bckr
    public final void o() {
        getWindow().getDecorView().setBackgroundColor(r());
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        super.invalidateOptionsMenu();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bcoc.b();
        Intent intent = getIntent();
        ErrorReport w = w(intent);
        if (Build.VERSION.SDK_INT >= 26 && ar() && fqlq.c()) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            this.C = keyguardManager;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                ap();
                return;
            }
        }
        if (bcoc.c(w)) {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
            getWindow().setSoftInputMode(16);
            getWindow().setFlags(JGCastService.FLAG_USE_TDLS, 0);
            getWindow().setStatusBarColor(r());
            if (Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
            if (fqnv.c()) {
                blah.b(this, w, R.style.DynamicUI_Theme_Transparent_Light_GM3Expressive, R.style.DynamicUI_Theme_Transparent_Dark_GM3Expressive, R.style.DynamicUI_Theme_Transparent_GM3Expressive);
            } else {
                blah.b(this, w, R.style.DynamicUI_Theme_Transparent_Light, R.style.DynamicUI_Theme_Transparent_Dark, R.style.DynamicUI_Theme_Transparent);
            }
            if (w.an && fqgk.c()) {
                int i = edxt.a;
            }
        } else {
            getWindow().setSoftInputMode(34);
            blah.b(this, w, R.style.gf_LightActivityStyle, R.style.gf_DarkActivityStyle, R.style.gf_DayNightActivityStyle);
        }
        bcsk.d(this, w, TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google"));
        if (!bcoc.c(w)) {
            bkug.b(this, hO(), true);
        }
        bcpw.b(this);
        if (w.E) {
            ((eluo) ((eluo) j.i()).ai((char) 3598)).x("Invalid request for feedback invocation. This action is not permitted");
            finish();
            return;
        }
        if (fqhm.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        setContentView(s());
        bcsk.j(this, w(intent), fywe.b, 0, 0);
        an(intent);
        if (!auts.b(this) || !bcoc.c(w)) {
            P();
        } else if (as(ag(w.a.packageName, w.P))) {
            ai(w, fywh.c, aj(w));
            P();
        } else {
            String str = w.a.packageName;
            bckp a = bckm.a(this);
            ErrorReport w2 = w(getIntent());
            WeakReference weakReference = new WeakReference(this);
            atwh t = t();
            fmiy ak = ak(str, w2.P);
            ag(str, w2.P);
            aura.F(new bcmr(weakReference, t, a, ak, w2), new Void[0]);
        }
        if (fqob.c()) {
            bcsg.a(this, auio.FEEDBACK_ACTIVITY);
        }
        this.D = registerForActivityResult(new acq(), new aby() { // from class: bcmf
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ausn ausnVar = FeedbackChimeraActivity.j;
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar, menu);
        MenuItem findItem = menu.findItem(R.id.common_send);
        int a = TextUtils.isEmpty(A()) ? blah.a(this, R.attr.gf_disabledIconColor) : blah.a(this, R.attr.gf_primaryBlueColor);
        int i = blag.a;
        Resources resources = getResources();
        Drawable a2 = blag.a(getDrawable(2131233549), resources);
        Drawable a3 = blag.a(a2, resources);
        a3.setAlpha(100);
        Bitmap createBitmap = Bitmap.createBitmap(a3.getIntrinsicWidth(), a3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        a3.setBounds(0, 0, a3.getIntrinsicWidth(), a3.getIntrinsicHeight());
        a3.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, a2);
        stateListDrawable.addState(StateSet.WILD_CARD, bitmapDrawable);
        blag.s(stateListDrawable, a);
        findItem.setIcon(stateListDrawable);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        bcpw.d(this);
        l = null;
        q = false;
        m = null;
        k = null;
        if (this.y != null) {
            aumo.a().b(this, this.E);
        }
        super.onDestroy();
    }

    @Override // defpackage.rxx, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        bcnl bcnlVar;
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!bcoc.c(w(getIntent())) || (bcnlVar = k) == null || bcnlVar.w() || p == null) {
            p();
            return true;
        }
        sun.b();
        return true;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!bcnt.e(x())) {
            return false;
        }
        ip ipVar = new ip(this);
        ipVar.setPositiveButton(R.string.common_ok, null);
        ipVar.o(R.string.gf_invalid_description_text);
        ipVar.create().show();
        return true;
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        if (aq(intent)) {
            return;
        }
        bcsk.j(this, w(intent), fywe.b, 0, 0);
        an(intent);
        bcoc.b();
        k = null;
        l = null;
        q = false;
        this.u = null;
        m = null;
        ErrorReport w = w(intent);
        super.onNewIntent(intent);
        if (Build.VERSION.SDK_INT >= 26 && ar() && fqlq.c()) {
            if (this.C == null) {
                this.C = (KeyguardManager) getSystemService("keyguard");
            }
            KeyguardManager keyguardManager = this.C;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                ap();
                return;
            }
        }
        if (w.E) {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w, intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
        } else if (!bcoc.c(w)) {
            O(intent);
        } else {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
            ao(intent, fqjx.a.lK().b());
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (TextUtils.isEmpty(this.z)) {
            if (k != null) {
                int itemId = menuItem.getItemId();
                if (itemId != R.id.common_send) {
                    if (itemId != 16908332) {
                        return super.onOptionsItemSelected(menuItem);
                    }
                    p();
                    return true;
                }
                bcsk.j(this, x(), fywe.e, 0, 0);
                View findViewById = findViewById(R.id.gf_issue_description);
                if (findViewById != null) {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                }
                final bcnl bcnlVar = k;
                bcnlVar.q();
                if (!bcnlVar.h.V()) {
                    String[] strArr = bcnlVar.f;
                    if (strArr.length > 0) {
                        final String str = strArr[0];
                        edzp edzpVar = new edzp(bcnlVar.h.b(), R.style.ThemeOverlay_Feedback_MaterialAlertDialog);
                        edzpVar.z(2131231779);
                        edzpVar.M(R.string.gf_send_feedback_as_Googler_title);
                        edzpVar.C(Html.fromHtml(bcnlVar.h.b().getString(R.string.gf_send_feedback_as_Googler_description, str)));
                        edzpVar.K(R.string.gf_yes_send_as_Googler, new DialogInterface.OnClickListener() { // from class: bcnf
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                bcnl bcnlVar2 = bcnl.this;
                                bcnlVar2.b().B = str;
                                bcnlVar2.h.L(bcnlVar2.b());
                            }
                        });
                        edzpVar.E(R.string.common_no, new DialogInterface.OnClickListener() { // from class: bcng
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                bcnl bcnlVar2 = bcnl.this;
                                bcnlVar2.h.L(bcnlVar2.b());
                            }
                        });
                        edzpVar.create().show();
                    }
                }
                bcnlVar.h.L(bcnlVar.b());
            }
        } else if (menuItem.getItemId() == R.id.common_send) {
            this.B.execute(new Runnable() { // from class: bcmd
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackChimeraActivity feedbackChimeraActivity = FeedbackChimeraActivity.this;
                    try {
                        feedbackChimeraActivity.y.c(feedbackChimeraActivity.z);
                    } catch (RemoteException e) {
                        ((eluo) ((eluo) FeedbackChimeraActivity.j.i()).ai((char) 3594)).B("Log message : %s", e.getMessage());
                    }
                }
            });
        }
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.getItem(0);
        if (!bcnt.e(x()) || !TextUtils.isEmpty(A())) {
            return true;
        }
        item.setOnMenuItemClickListener(this);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        bcoc.b();
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            bcnlVar.j(bundle);
            return;
        }
        k = new bcnl(this, bundle);
        if (!bcoc.c(w(getIntent()))) {
            this.t = true;
        }
        k.n();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            bcnlVar.k(bundle);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            bcnlVar.l();
        }
    }

    @Override // defpackage.bckr
    public final void p() {
        bcnl bcnlVar = k;
        if (bcnlVar != null) {
            bcnlVar.l();
        }
        if (!bcoc.c(w(getIntent())) || this.x == null) {
            finish();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.dui_slide_down);
        loadAnimation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        this.x.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new bcmo(this));
        D(q(), r(), 500);
    }

    public final int q() {
        return ion.f(getColor(R.color.gm3_ref_palette_black), 102);
    }

    public final int r() {
        return getColor(android.R.color.transparent);
    }

    public final FrameLayout s() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.feedback_content);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    final atwh t() {
        atwh atwhVar = new atwh();
        atwhVar.d = getPackageName();
        atwhVar.e = getPackageName();
        atwhVar.a = getApplicationInfo().uid;
        return atwhVar;
    }

    public final atwh u() {
        String str = null;
        Account account = TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google");
        atwh t = t();
        if (account != null) {
            try {
                str = wkg.f(this, account, "oauth2:https://www.googleapis.com/auth/supportcontent");
            } catch (IOException | wjw unused) {
            }
            if (str != null) {
                t.n("auth_token", str);
            }
        }
        return t;
    }

    public final ErrorReport w(Intent intent) {
        ErrorReport errorReport = new ErrorReport();
        if (intent.hasExtra("android.intent.extra.BUG_REPORT")) {
            errorReport.a = (ApplicationErrorReport) intent.getParcelableExtra("android.intent.extra.BUG_REPORT");
        }
        if (intent.hasExtra("com.android.feedback.SAFEPARCELABLE_REPORT")) {
            errorReport = (ErrorReport) intent.getParcelableExtra("com.android.feedback.SAFEPARCELABLE_REPORT");
            if (!TextUtils.isEmpty(errorReport.B)) {
                this.v = errorReport.B;
                if (!errorReport.E) {
                    errorReport.B = "";
                }
            }
        }
        bcpw.i = errorReport.Z;
        if (TextUtils.isEmpty(errorReport.ag)) {
            errorReport.ag = bctg.c();
        }
        return errorReport;
    }

    final bcnl y(Parcelable parcelable, ErrorReport errorReport, Long l2) {
        Screenshot c;
        Screenshot screenshot = null;
        if (bcnt.e(errorReport)) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(errorReport.a.packageName, 0);
                Bitmap bitmap = errorReport.af;
                if (bitmap != null) {
                    c = Screenshot.b(bitmap);
                } else if (parcelable != null) {
                    c = (Screenshot) parcelable;
                } else {
                    byte[] bArr = errorReport.v;
                    if (bArr != null) {
                        c = Screenshot.d(bArr, errorReport.x, errorReport.w);
                    } else if (TextUtils.isEmpty(errorReport.T)) {
                        c = !TextUtils.isEmpty(errorReport.u) ? Screenshot.c(errorReport.u, errorReport.x, errorReport.w) : null;
                    } else {
                        c = new Screenshot();
                        Screenshot.a(getFilesDir(), errorReport.T, c, false, this);
                    }
                }
                errorReport.a.processName = applicationInfo.processName;
                screenshot = c;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                finish();
                return null;
            }
        }
        bcnl bcnlVar = new bcnl(this, errorReport, screenshot, l2);
        bcnlVar.n();
        return bcnlVar;
    }

    @Override // defpackage.bcnw
    public final eqgo z() {
        return this.B;
    }

    @Override // defpackage.bckr, defpackage.bcnw, defpackage.bcnm
    public final Context b() {
        return this;
    }

    @Override // defpackage.bckr
    public final bcnw c() {
        return this;
    }

    @Override // defpackage.bcnm
    public final bckr v() {
        return this;
    }

    @Override // defpackage.bckr
    public final void h(String str) {
    }
}
