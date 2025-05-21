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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.arts;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asiu;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asot;
import defpackage.aspy;
import defpackage.bagq;
import defpackage.bags;
import defpackage.bagt;
import defpackage.bagv;
import defpackage.baim;
import defpackage.baio;
import defpackage.baiq;
import defpackage.bair;
import defpackage.bais;
import defpackage.bait;
import defpackage.baiu;
import defpackage.baiv;
import defpackage.baja;
import defpackage.bajb;
import defpackage.bajp;
import defpackage.bajq;
import defpackage.bajx;
import defpackage.bajz;
import defpackage.baka;
import defpackage.bakb;
import defpackage.bakg;
import defpackage.bakl;
import defpackage.bakp;
import defpackage.baky;
import defpackage.bakz;
import defpackage.bala;
import defpackage.balb;
import defpackage.balc;
import defpackage.bald;
import defpackage.bale;
import defpackage.balf;
import defpackage.balk;
import defpackage.baln;
import defpackage.balv;
import defpackage.balz;
import defpackage.bama;
import defpackage.bamg;
import defpackage.baog;
import defpackage.baok;
import defpackage.baoo;
import defpackage.baor;
import defpackage.baox;
import defpackage.bapf;
import defpackage.bapk;
import defpackage.bipr;
import defpackage.biqu;
import defpackage.bivj;
import defpackage.bivk;
import defpackage.bivo;
import defpackage.bivr;
import defpackage.bivs;
import defpackage.bp;
import defpackage.byhr;
import defpackage.dvyt;
import defpackage.dvyx;
import defpackage.eble;
import defpackage.ebna;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.epmm;
import defpackage.epnk;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fefi;
import defpackage.fjrw;
import defpackage.fjse;
import defpackage.fjtb;
import defpackage.fjtc;
import defpackage.fjte;
import defpackage.fjtf;
import defpackage.fjtg;
import defpackage.fjth;
import defpackage.fnnl;
import defpackage.fnob;
import defpackage.fnoh;
import defpackage.fnou;
import defpackage.fnpd;
import defpackage.fnpg;
import defpackage.fnpp;
import defpackage.fnps;
import defpackage.fnqb;
import defpackage.fnqe;
import defpackage.fnqk;
import defpackage.fnqw;
import defpackage.fnro;
import defpackage.fnsj;
import defpackage.fnth;
import defpackage.fnvm;
import defpackage.fnvs;
import defpackage.fonb;
import defpackage.fwac;
import defpackage.fwaf;
import defpackage.ig;
import defpackage.imw;
import defpackage.ip;
import defpackage.ipv;
import defpackage.qet;
import defpackage.rbj;
import defpackage.unx;
import defpackage.uoh;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FeedbackChimeraActivity extends qet implements MenuItem.OnMenuItemClickListener, balz, baja, bagv, baka, bajq, bivo {
    public static bajp k;
    public static Bitmap l;
    public static List m;
    public static HelpConfig n;
    public static biqu o;
    public static rbj p;
    private KeyguardManager C;
    private abv D;
    private ServiceConnection E;
    private String F;
    public bajb r;
    public Map s;
    public Bitmap u;
    public String v;
    public View x;
    public bapf y;
    public String z;
    public static final asot j = asot.b("gf_FeedbackActivity", asej.FEEDBACK);
    public static boolean q = false;
    private final ensv B = new asmf(Integer.MAX_VALUE, 10);
    public boolean t = false;
    public boolean w = false;
    public boolean A = false;

    public static boolean W() {
        return l != null;
    }

    static final boolean ab(ErrorReport errorReport) {
        return fnqw.a.a().a() && !errorReport.E;
    }

    static final boolean ac(ErrorReport errorReport) {
        if (fnnl.a.a().I() && !errorReport.E) {
            String str = errorReport.a.packageName;
            fnnl fnnlVar = fnnl.a;
            String B = fnnlVar.a().B();
            int i = errorReport.a.type;
            String F = fnnlVar.a().F();
            if (str == null || B == null || F == null) {
                return false;
            }
            for (String str2 : bivr.y(B)) {
                if (str.startsWith(str2) && !TextUtils.isEmpty(str2)) {
                    return bivr.x(Integer.toString(i), F);
                }
            }
        }
        return false;
    }

    public static final fefi af() {
        long currentTimeMillis = System.currentTimeMillis();
        fecj v = fefi.a.v();
        long j2 = currentTimeMillis / 1000;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ((fefi) fecpVar).b = j2;
        long j3 = currentTimeMillis % 1000;
        if (!fecpVar.L()) {
            v.U();
        }
        ((fefi) v.b).c = (int) (j3 * 1000000);
        return (fefi) v.Q();
    }

    public static final fjtg ag(String str, String str2) {
        Locale g = ipv.a(Resources.getSystem().getConfiguration()).g(0);
        String languageTag = g != null ? g.toLanguageTag() : "en";
        String a = baor.a();
        fecj v = fjtg.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fjtg fjtgVar = (fjtg) v.b;
        str.getClass();
        fjtgVar.b |= 1;
        fjtgVar.c = str;
        boolean c = fnsj.c();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        fjtg fjtgVar2 = (fjtg) fecpVar;
        fjtgVar2.b |= 32;
        fjtgVar2.h = c;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        fjtg fjtgVar3 = (fjtg) fecpVar2;
        languageTag.getClass();
        fjtgVar3.b |= 2;
        fjtgVar3.d = languageTag;
        if (!fecpVar2.L()) {
            v.U();
        }
        fjtg fjtgVar4 = (fjtg) v.b;
        a.getClass();
        fjtgVar4.b |= 4;
        fjtgVar4.e = a;
        String e = fnou.a.a().e();
        if (!v.b.L()) {
            v.U();
        }
        fjtg fjtgVar5 = (fjtg) v.b;
        e.getClass();
        fjtgVar5.b |= 8;
        fjtgVar5.f = e;
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fjtg fjtgVar6 = (fjtg) v.b;
            str2.getClass();
            fjtgVar6.b |= 16;
            fjtgVar6.g = str2;
        }
        return (fjtg) v.Q();
    }

    public static final boolean ah(fefi fefiVar) {
        return af().b - fefiVar.b < fnou.b();
    }

    private final epnk aj(ErrorReport errorReport) {
        fjtc fjtcVar = ((fjth) this.s.get(ag(errorReport.a.packageName, errorReport.P))).d;
        if (fjtcVar == null) {
            fjtcVar = fjtc.a;
        }
        epnk epnkVar = fjtcVar.c;
        return epnkVar == null ? epnk.a : epnkVar;
    }

    private final fjtb ak(String str, String str2) {
        fjtg ag = ag(str, str2);
        fecj v = fjrw.a.v();
        String str3 = ag.c;
        if (!v.b.L()) {
            v.U();
        }
        fjrw fjrwVar = (fjrw) v.b;
        str3.getClass();
        fjrwVar.b |= 4;
        fjrwVar.c = str3;
        float f = getResources().getDisplayMetrics().density;
        if (!v.b.L()) {
            v.U();
        }
        fjrw fjrwVar2 = (fjrw) v.b;
        fjrwVar2.b |= 16;
        fjrwVar2.e = f;
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fjrw fjrwVar3 = (fjrw) v.b;
            str2.getClass();
            fjrwVar3.b |= 8;
            fjrwVar3.d = str2;
        }
        fecj v2 = fjtb.a.v();
        String str4 = ag.e;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        fjtb fjtbVar = (fjtb) fecpVar;
        str4.getClass();
        fjtbVar.b |= 2;
        fjtbVar.d = str4;
        String str5 = ag.f;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        fjtb fjtbVar2 = (fjtb) fecpVar2;
        str5.getClass();
        fjtbVar2.b |= 4;
        fjtbVar2.e = str5;
        boolean z = ag.h;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fjtb fjtbVar3 = (fjtb) v2.b;
        fjtbVar3.b |= 8;
        fjtbVar3.f = z;
        fecj v3 = fjse.a.v();
        String str6 = ag.d;
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        fjse fjseVar = (fjse) fecpVar3;
        str6.getClass();
        fjseVar.b |= 2;
        fjseVar.e = str6;
        if (!fecpVar3.L()) {
            v3.U();
        }
        fjse fjseVar2 = (fjse) v3.b;
        fjrw fjrwVar4 = (fjrw) v.Q();
        fjrwVar4.getClass();
        fjseVar2.d = fjrwVar4;
        fjseVar2.c = 2;
        fjse fjseVar3 = (fjse) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        fjtb fjtbVar4 = (fjtb) v2.b;
        fjseVar3.getClass();
        fjtbVar4.c = fjseVar3;
        fjtbVar4.b |= 1;
        return (fjtb) v2.Q();
    }

    private final Map al() {
        try {
            fjte fjteVar = (fjte) new bags(this).a().get(2L, TimeUnit.SECONDS);
            HashMap hashMap = new HashMap();
            for (fjtf fjtfVar : fjteVar.b) {
                fjtg fjtgVar = fjtfVar.c;
                if (fjtgVar == null) {
                    fjtgVar = fjtg.a;
                }
                fjth fjthVar = fjtfVar.d;
                if (fjthVar == null) {
                    fjthVar = fjth.a;
                }
                hashMap.put(fjtgVar, fjthVar);
            }
            return hashMap;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) j.h()).s(e)).ah((char) 3585)).x("Exception occurred while getting config");
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
        if (fnpg.c()) {
            baoo.j(this, w(intent), intent.getBooleanExtra("LAUNCHED_FROM_FEEDBACK_MODULE", false) ? fwac.z : fwac.A, 0, 0);
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
        baim baimVar = new baim(this);
        KeyguardManager keyguardManager = this.C;
        if (keyguardManager != null) {
            keyguardManager.requestDismissKeyguard(getContainerActivity(), baimVar);
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

    private final boolean as(fjtg fjtgVar) {
        if (this.s == null) {
            this.s = al();
        }
        if (!this.s.containsKey(fjtgVar)) {
            return false;
        }
        fefi fefiVar = ((fjth) this.s.get(fjtgVar)).c;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        return ah(fefiVar);
    }

    public static ErrorReport x() {
        bajp bajpVar = k;
        if (bajpVar != null) {
            return bajpVar.b();
        }
        return null;
    }

    @Override // defpackage.bajq
    public final String A() {
        bajb bajbVar = this.r;
        return bajbVar == null ? "" : ((EditText) ((bald) bajbVar).y(R.id.gf_issue_description)).getText().toString().trim();
    }

    @Override // defpackage.bajq
    public final String B() {
        return this.v;
    }

    @Override // defpackage.baja
    public final void C(CharSequence charSequence) {
        if (k == null) {
            return;
        }
        if (bajx.e(x())) {
            super.invalidateOptionsMenu();
        }
        k.b().b = charSequence.toString();
    }

    public final void D(int i, int i2, int i3) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(i3);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: baik
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FeedbackChimeraActivity.this.getWindow().getDecorView().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    @Override // defpackage.bajq
    public final void E() {
        String str;
        int i;
        if (k == null) {
            return;
        }
        ErrorReport w = w(getIntent());
        if (w == null || !bakg.c(w)) {
            if (!bivk.a(fnqk.a.a().a()) || (str = this.F) == null) {
                str = this.v;
            }
            bajp bajpVar = k;
            String[] strArr = bajpVar.e;
            int length = strArr.length;
            String[] strArr2 = bajpVar.f;
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
            bajb bajbVar = this.r;
            if (bajbVar != null) {
                bald baldVar = (bald) bajbVar;
                Spinner spinner = (Spinner) baldVar.y(R.id.gf_account_spinner);
                ArrayAdapter arrayAdapter = new ArrayAdapter(bajbVar.getContext(), R.layout.gf_material_2_spinner, strArr3);
                arrayAdapter.setDropDownViewResource(R.layout.gf_account_spinner_dropdown_item);
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner.setOnTouchListener(new balb());
                spinner.setOnItemSelectedListener(new balc(baldVar));
                if (i2 > 1) {
                    spinner.setSelection(i);
                }
            }
        }
    }

    @Override // defpackage.bajq
    public final void F(Screenshot screenshot, ErrorReport errorReport) {
        int i;
        int i2;
        if (screenshot == null || TextUtils.isEmpty(screenshot.d)) {
            bald baldVar = (bald) this.r;
            ((ImageView) baldVar.y(R.id.gf_screenshot_icon)).setVisibility(8);
            ((MaterialCardView) baldVar.y(R.id.gf_include_screenshot_card)).setVisibility(8);
            ((TextView) baldVar.y(R.id.gf_edit_screenshot)).setVisibility(8);
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
        Pair a = bajx.a(getResources(), rect, i, i2, true);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        asng.F(new bair(this, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)), screenshot, errorReport, a), new Void[0]);
    }

    @Override // defpackage.bivo
    public final void G(Parcelable parcelable) {
        bajp bajpVar = k;
        if (bajpVar == null) {
            ((ejhf) ((ejhf) j.j()).ah((char) 3593)).x("Session is null, not updating screenshot.");
        } else {
            bajpVar.s((Screenshot) parcelable);
        }
    }

    @Override // defpackage.baja
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
            bajp bajpVar = k;
            String[] strArr = bajpVar.e;
            int length = strArr.length;
            String str = i < length ? strArr[i] : bajpVar.f[i - length];
            if (i < length) {
                this.F = str;
            }
            bajpVar.b().B = str;
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

    @Override // defpackage.baja
    public final void I(Intent intent) {
        if (intent == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 3595)).x("onFragmentResume called with null intent.");
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
                ((ejhf) ((ejhf) j.i()).ah((char) 3583)).B("Log message : %s", e.getMessage());
                return;
            }
        }
        if (k == null) {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
        }
        bajp bajpVar = k;
        if (bajpVar == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 3594)).x("onFragmentResume failed to create a session.");
            return;
        }
        if (this.t) {
            ErrorReport b = bajpVar.b();
            Screenshot screenshot = k.g;
            bajb bajbVar = this.r;
            final bald baldVar = (bald) bajbVar;
            ImageView imageView = (ImageView) baldVar.y(R.id.gf_screenshot_icon);
            ProgressBar progressBar = (ProgressBar) baldVar.y(R.id.gf_progress_spinner);
            TextView textView = (TextView) baldVar.y(R.id.gf_edit_screenshot);
            EditText editText = (EditText) baldVar.y(R.id.gf_issue_description);
            TextView textView2 = (TextView) baldVar.y(R.id.gf_view_logs);
            CheckBox checkBox = (CheckBox) baldVar.y(R.id.gf_include_screenshot);
            CheckBox checkBox2 = (CheckBox) baldVar.y(R.id.gf_include_logs);
            editText.setText(b.b);
            editText.setSelection(editText.getText().length());
            String string = bajbVar.getString(R.string.common_view);
            textView2.setLinksClickable(true);
            textView2.setText(string);
            checkBox.setChecked(!b.W);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bakr
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object context = bald.this.getContext();
                    if (context instanceof baja) {
                        ((baja) context).aa();
                    }
                }
            });
            if (bivk.a(fnqb.c())) {
                bajx.c(checkBox);
            }
            checkBox2.setChecked(!b.W);
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: baks
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object context = bald.this.getContext();
                    if (context instanceof baja) {
                        ((baja) context).aa();
                    }
                }
            });
            if (bivk.a(fnqb.c())) {
                bajx.c(checkBox2);
            }
            baldVar.y(R.id.gf_system_info_card).setOnClickListener(new View.OnClickListener() { // from class: bakt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object context = bald.this.getContext();
                    if (context instanceof baja) {
                        ((baja) context).i();
                    }
                }
            });
            baldVar.y(R.id.gf_screenshot_card).setOnClickListener(new View.OnClickListener() { // from class: baku
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object context = bald.this.getContext();
                    if (context instanceof baja) {
                        ((baja) context).j();
                    }
                }
            });
            if (screenshot == null) {
                imageView.setVisibility(8);
                textView.setVisibility(8);
            } else {
                imageView.setMaxHeight(bajbVar.getResources().getDimensionPixelSize(R.dimen.gf_screenshot_preview_height));
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                progressBar.setVisibility(0);
            }
            Resources resources = bajbVar.getResources();
            TextView textView3 = (TextView) baldVar.y(R.id.gf_preview_text);
            String string2 = resources.getString(R.string.gf_legal_request);
            String string3 = resources.getString(R.string.gf_account_system_info);
            String string4 = resources.getString(R.string.common_privacy_policy_composed_string);
            String string5 = resources.getString(R.string.common_terms_of_service_composed_string);
            Spannable a2 = URLSpanNoUnderline.a(Html.fromHtml(resources.getString(R.string.gf_policy, string2, string3, string4, string5)));
            bivr.t(a2, string2, new bakz(baldVar, fnnl.a.a().x()));
            bivr.t(a2, string3, new baky(baldVar));
            bivr.t(a2, string4, new bala(baldVar));
            bivr.t(a2, string5, new bakz(baldVar, fnnl.a.a().D()));
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
            ig hy = hy();
            if (hy != null) {
                hy.A(getString(R.string.gf_send_feedback));
                hy.o(true);
                hy.N();
            }
            N(!(k.m == 3));
            this.t = false;
        }
    }

    @Override // defpackage.balz
    public final void J(bakp bakpVar) {
        bajp bajpVar = k;
        if (bajpVar != null) {
            bajpVar.i(bakpVar);
        }
    }

    @Override // defpackage.baka
    public final void K(bajz bajzVar, ErrorReport errorReport, balk balkVar) {
        bajz bajzVar2;
        biqu biquVar;
        String str;
        String str2;
        if (bakg.c(errorReport)) {
            if (balkVar != null) {
                balkVar.dismiss();
            }
            if (bajzVar != null) {
                k.a().h(epmm.CLIENT_REFERENCE_IS_JUNK, true != bajzVar.c ? "false" : "true");
            }
            k.m(epmm.CLIENT_REFERENCE_JUNK_ASYNC);
            return;
        }
        if (ab(errorReport)) {
            bajp bajpVar = k;
            if (bajpVar.c && (str2 = bajpVar.d) != null && !errorReport.b.equals(str2)) {
                ae(129, errorReport);
            }
        }
        if (bajzVar == null) {
            bajzVar2 = null;
        } else {
            if (bajzVar.c && !k.c && ab(errorReport)) {
                ae(128, errorReport);
                bajp bajpVar2 = k;
                String str3 = errorReport.b;
                bajpVar2.d = str3;
                bakl baklVar = new bakl();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("description", str3);
                baklVar.setArguments(bundle);
                baklVar.show(getSupportFragmentManager(), "junkDialog");
                if (balkVar != null) {
                    balkVar.dismiss();
                }
                k.c = true;
                return;
            }
            bajzVar2 = bajzVar;
        }
        if (!ac(errorReport) || bajzVar2 == null || (biquVar = bajzVar2.b) == null || (str = bajzVar2.a) == null) {
            errorReport.ab = false;
            errorReport.H = true;
            baln.f(errorReport, this);
            f(errorReport, true);
            return;
        }
        if (balkVar != null) {
            balkVar.dismiss();
        }
        errorReport.ab = true;
        errorReport.H = false;
        o = biquVar;
        balv balvVar = new balv();
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("help_response_title", biquVar.f);
        bundle2.putCharSequence("help_response_snippet", str);
        if (bivk.b(fnpp.c())) {
            bundle2.putCharSequence("help_response_prediction_id", biquVar.c);
            bundle2.putCharSequence("help_response_reporting_id", biquVar.d);
        }
        balvVar.setArguments(bundle2);
        balvVar.setCancelable(false);
        balvVar.show(getSupportFragmentManager(), "suggestionDialog");
        String str4 = errorReport.b;
        biqu biquVar2 = o;
        String str5 = biquVar2.g;
        String str6 = biquVar2.c;
        String str7 = biquVar2.d;
        if (errorReport == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 3591)).x("ErrorReport is required to populate MetricsData.");
        } else {
            Account account = TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google");
            asot asotVar = baoo.a;
            if (bivk.b(fnpp.d()) && bivk.b(fonb.d())) {
                if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                    ((ejhf) ((ejhf) baoo.a.i()).ah(3682)).P("Trying to log MoltronInteraction for ShownFeedbackSuggestion with predictionId: %s, reportingId: %s. Falling back to old metric format.", str6, str7);
                } else {
                    baoo.h(this, errorReport, 43, account, str5, str4, str6, str7, 2);
                }
            }
            baoo.g(this, errorReport, 43, account, str5, str4);
        }
        f(errorReport, false);
    }

    @Override // defpackage.bajq
    public final void L(ErrorReport errorReport) {
        bajp bajpVar = k;
        if (bajpVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("feedbackUserCtlConsent", String.valueOf(bajpVar.h.S()));
            bajpVar.l.b(bundle, false);
        }
        if (aspy.b(this) && (ab(errorReport) || ac(errorReport))) {
            n = bajx.b(errorReport, this);
            AsyncTask a = bakb.a(this, errorReport);
            if (a != null) {
                asng.F(a, n);
                return;
            }
        }
        baln.f(errorReport, this);
        f(errorReport, true);
    }

    public final void M(ErrorReport errorReport, boolean z) {
        if (aspy.b(this) && bajx.e(errorReport)) {
            FeedbackAsyncChimeraService.c(this, errorReport);
        } else {
            new baln(this, errorReport).start();
        }
        if (z) {
            if (!bakg.c(errorReport)) {
                p();
            } else if (k != null) {
                bama.f();
            }
        }
    }

    @Override // defpackage.bajq
    public final void N(boolean z) {
        bald baldVar = (bald) this.r;
        baldVar.y(R.id.gf_progress).setVisibility(true != z ? 4 : 0);
        baldVar.y(R.id.gf_feedback_view).setVisibility(true != z ? 0 : 4);
    }

    public final void O(Intent intent) {
        this.t = true;
        bald.a = false;
        bald baldVar = new bald();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_intent", intent);
        baldVar.setArguments(bundle);
        this.r = baldVar;
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
        if (w != null && (b = baox.b((str = w.a.packageName), fnnl.o())) != null) {
            if (baox.a(getPackageManager().getPackageInfo(str, 0).versionName, b) <= 0) {
                ae(119, w);
                ErrorReport w2 = w(intent);
                new bamg(new baio(this, w2, intent), w2).show(getSupportFragmentManager(), "UpgradeDialog");
                bivj.a(this.B, this);
            }
        }
        ae(8, w);
        String stringExtra = intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
        this.z = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.E = new baiq(this, intent);
            asiu.a().d(this, new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackAsyncService"), this.E, 1);
        } else if (bakg.c(w)) {
            ao(intent, false);
        } else {
            O(intent);
        }
        bivj.a(this.B, this);
    }

    public final void Q(bajp bajpVar, boolean z) {
        if (bajpVar.x()) {
            M(bajpVar.b(), z);
        } else {
            new byhr(Looper.getMainLooper()).postDelayed(new baiu(this, bajpVar, z), fnnl.e());
        }
    }

    public final boolean R() {
        return this.w && fnnl.p();
    }

    @Override // defpackage.bajq
    public final boolean S() {
        return ((CheckBox) ((bald) this.r).y(R.id.gf_email_consent_check)).isChecked();
    }

    @Override // defpackage.bajq
    public final boolean T() {
        bajb bajbVar = this.r;
        if (!bivk.a(fnqe.c())) {
            return ((CheckBox) ((bald) bajbVar).y(R.id.gf_include_screenshot)).isChecked();
        }
        CheckBox checkBox = (CheckBox) ((bald) bajbVar).y(R.id.gf_include_screenshot);
        if (checkBox == null || checkBox.getVisibility() != 0) {
            return false;
        }
        return checkBox.isChecked();
    }

    @Override // defpackage.bajq
    public final boolean U() {
        bajb bajbVar = this.r;
        if (!bivk.a(fnqe.c())) {
            return ((CheckBox) ((bald) bajbVar).y(R.id.gf_include_logs)).isChecked();
        }
        CheckBox checkBox = (CheckBox) ((bald) bajbVar).y(R.id.gf_include_logs);
        if (checkBox == null || checkBox.getVisibility() != 0) {
            return false;
        }
        return checkBox.isChecked();
    }

    @Override // defpackage.bajq
    public final boolean V() {
        return bald.a;
    }

    @Override // defpackage.bajq
    public final boolean X() {
        return bakg.c(w(getIntent()));
    }

    @Override // defpackage.baja
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

    @Override // defpackage.bagv
    public final Activity a() {
        return getContainerActivity();
    }

    @Override // defpackage.baja
    public final void aa() {
        bajp bajpVar = k;
        if (bajpVar == null) {
            return;
        }
        bajpVar.q();
    }

    @Override // defpackage.baka
    public final void ad(balk balkVar) {
        balkVar.show(getSupportFragmentManager(), "progress_dialog");
    }

    public final void ae(int i, ErrorReport errorReport) {
        if (errorReport == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 3590)).x("ErrorReport is required to populate MetricsData.");
        } else {
            baoo.g(this, errorReport, i, TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google"), null, null);
        }
    }

    public final void ai(ErrorReport errorReport, int i, epnk epnkVar) {
        if (!fnsj.d()) {
            baoo.j(this, errorReport, fwac.p, 0, i);
            return;
        }
        baog baogVar = new baog();
        baogVar.a = x();
        baogVar.b(fwac.p);
        baogVar.m = i;
        baogVar.h = Integer.valueOf(balf.a(epnkVar.c));
        baogVar.i = Integer.valueOf(balf.a(epnkVar.d));
        baoo.b(this, baogVar.a());
    }

    @Override // defpackage.bagv
    public final void d() {
        getWindow().getDecorView().setBackgroundColor(q());
    }

    @Override // defpackage.bagv
    public final void e() {
        x();
    }

    @Override // defpackage.bagv
    public final void f(ErrorReport errorReport, boolean z) {
        if (bivk.b(fnoh.c())) {
            this.B.execute(new bait(this, errorReport, z));
            return;
        }
        bajp bajpVar = k;
        if (bajpVar == null || !bajpVar.u()) {
            M(errorReport, z);
        } else {
            Q(bajpVar, z);
        }
    }

    @Override // defpackage.bagv
    public final void g(String str, ErrorReport errorReport) {
        if (!fnps.c() || !str.equals(fnnl.n())) {
            bale.c(getContainerActivity(), str, errorReport);
            return;
        }
        try {
            dvyx.b(this, this.D, errorReport != null ? errorReport.B : "");
        } catch (dvyt unused) {
            bale.c(getContainerActivity(), fnnl.n(), errorReport);
        }
    }

    @Override // defpackage.baja, defpackage.bagv
    public final void i() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    @Override // defpackage.baja, defpackage.bagv
    public final void j() {
        ThemeSettings themeSettings;
        Intent intent = new Intent();
        if (R()) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ErrorReport x = x();
            if (x != null && (themeSettings = x.Y) != null && themeSettings.b != 0) {
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", bipr.a(themeSettings));
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    @Override // defpackage.bagv
    public final void k() {
        startActivity(bale.a(this));
    }

    @Override // defpackage.bagv
    public final void l() {
        startActivity(bale.b(this));
    }

    @Override // defpackage.bagv
    public final void m(Integer num, Integer num2, eitj eitjVar) {
        rbj.d(num, num2, eitjVar);
    }

    @Override // defpackage.bagv, defpackage.bajq
    public final void n(Runnable runnable) {
        runOnUiThread(runnable);
    }

    @Override // defpackage.bagv
    public final void o() {
        getWindow().getDecorView().setBackgroundColor(r());
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        super.invalidateOptionsMenu();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bakg.b();
        Intent intent = getIntent();
        ErrorReport w = w(intent);
        if (Build.VERSION.SDK_INT >= 26 && ar() && fnth.c()) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            this.C = keyguardManager;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                ap();
                return;
            }
        }
        if (bakg.c(w)) {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
            getWindow().setSoftInputMode(16);
            getWindow().setFlags(JGCastService.FLAG_USE_TDLS, 0);
            getWindow().setStatusBarColor(r());
            if (Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
            if (fnvm.c()) {
                bivs.b(this, w, R.style.DynamicUI_Theme_Transparent_Light_GM3Expressive, R.style.DynamicUI_Theme_Transparent_Dark_GM3Expressive, R.style.DynamicUI_Theme_Transparent_GM3Expressive);
            } else {
                bivs.b(this, w, R.style.DynamicUI_Theme_Transparent_Light, R.style.DynamicUI_Theme_Transparent_Dark, R.style.DynamicUI_Theme_Transparent);
            }
            if (w.an && fnob.c()) {
                int i = eble.a;
            }
        } else {
            getWindow().setSoftInputMode(34);
            bivs.b(this, w, R.style.gf_LightActivityStyle, R.style.gf_DarkActivityStyle, R.style.gf_DayNightActivityStyle);
        }
        baoo.d(this, w, TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google"));
        if (!bakg.c(w)) {
            bipr.b(this, hy(), true);
        }
        bama.b(this);
        if (w.E) {
            ((ejhf) ((ejhf) j.i()).ah((char) 3592)).x("Invalid request for feedback invocation. This action is not permitted");
            finish();
            return;
        }
        if (fnpd.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        setContentView(s());
        baoo.j(this, w(intent), fwac.b, 0, 0);
        an(intent);
        if (!aspy.b(this) || !bakg.c(w)) {
            P();
        } else if (as(ag(w.a.packageName, w.P))) {
            ai(w, fwaf.c, aj(w));
            P();
        } else {
            String str = w.a.packageName;
            bagt a = bagq.a(this);
            ErrorReport w2 = w(getIntent());
            WeakReference weakReference = new WeakReference(this);
            arts t = t();
            fjtb ak = ak(str, w2.P);
            ag(str, w2.P);
            asng.F(new baiv(weakReference, t, a, ak, w2), new Void[0]);
        }
        if (fnvs.c()) {
            baok.a(this, aseu.FEEDBACK_ACTIVITY);
        }
        this.D = registerForActivityResult(new acl(), new abt() { // from class: baij
            @Override // defpackage.abt
            public final void jq(Object obj) {
                asot asotVar = FeedbackChimeraActivity.j;
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar, menu);
        MenuItem findItem = menu.findItem(R.id.common_send);
        int a = TextUtils.isEmpty(A()) ? bivs.a(this, R.attr.gf_disabledIconColor) : bivs.a(this, R.attr.gf_primaryBlueColor);
        int i = bivr.a;
        Resources resources = getResources();
        Drawable a2 = bivr.a(getDrawable(2131233483), resources);
        Drawable a3 = bivr.a(a2, resources);
        a3.setAlpha(100);
        Bitmap createBitmap = Bitmap.createBitmap(a3.getIntrinsicWidth(), a3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        a3.setBounds(0, 0, a3.getIntrinsicWidth(), a3.getIntrinsicHeight());
        a3.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, a2);
        stateListDrawable.addState(StateSet.WILD_CARD, bitmapDrawable);
        bivr.s(stateListDrawable, a);
        findItem.setIcon(stateListDrawable);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        bama.d(this);
        l = null;
        q = false;
        m = null;
        k = null;
        if (this.y != null) {
            asiu.a().b(this, this.E);
        }
        super.onDestroy();
    }

    @Override // defpackage.qet, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        bajp bajpVar;
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!bakg.c(w(getIntent())) || (bajpVar = k) == null || bajpVar.w() || p == null) {
            p();
            return true;
        }
        rbj.b();
        return true;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!bajx.e(x())) {
            return false;
        }
        ip ipVar = new ip(this);
        ipVar.setPositiveButton(R.string.common_ok, null);
        ipVar.m(R.string.gf_invalid_description_text);
        ipVar.create().show();
        return true;
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        if (aq(intent)) {
            return;
        }
        baoo.j(this, w(intent), fwac.b, 0, 0);
        an(intent);
        bakg.b();
        k = null;
        l = null;
        q = false;
        this.u = null;
        m = null;
        ErrorReport w = w(intent);
        super.onNewIntent(intent);
        if (Build.VERSION.SDK_INT >= 26 && ar() && fnth.c()) {
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
        } else if (!bakg.c(w)) {
            O(intent);
        } else {
            k = y(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), w(intent), intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null);
            ao(intent, fnro.a.a().b());
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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
                baoo.j(this, x(), fwac.e, 0, 0);
                View findViewById = findViewById(R.id.gf_issue_description);
                if (findViewById != null) {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                }
                final bajp bajpVar = k;
                bajpVar.q();
                if (!bajpVar.h.V()) {
                    String[] strArr = bajpVar.f;
                    if (strArr.length > 0) {
                        final String str = strArr[0];
                        ebna ebnaVar = new ebna(bajpVar.h.b(), R.style.ThemeOverlay_Feedback_MaterialAlertDialog);
                        ebnaVar.z(2131231773);
                        ebnaVar.M(R.string.gf_send_feedback_as_Googler_title);
                        ebnaVar.C(Html.fromHtml(bajpVar.h.b().getString(R.string.gf_send_feedback_as_Googler_description, str)));
                        ebnaVar.K(R.string.gf_yes_send_as_Googler, new DialogInterface.OnClickListener() { // from class: bajj
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                bajp bajpVar2 = bajp.this;
                                bajpVar2.b().B = str;
                                bajpVar2.h.L(bajpVar2.b());
                            }
                        });
                        ebnaVar.E(R.string.common_no, new DialogInterface.OnClickListener() { // from class: bajk
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                bajp bajpVar2 = bajp.this;
                                bajpVar2.h.L(bajpVar2.b());
                            }
                        });
                        ebnaVar.create().show();
                    }
                }
                bajpVar.h.L(bajpVar.b());
            }
        } else if (menuItem.getItemId() == R.id.common_send) {
            this.B.execute(new Runnable() { // from class: baih
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackChimeraActivity feedbackChimeraActivity = FeedbackChimeraActivity.this;
                    try {
                        feedbackChimeraActivity.y.c(feedbackChimeraActivity.z);
                    } catch (RemoteException e) {
                        ((ejhf) ((ejhf) FeedbackChimeraActivity.j.i()).ah((char) 3588)).B("Log message : %s", e.getMessage());
                    }
                }
            });
        }
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.getItem(0);
        if (!bajx.e(x()) || !TextUtils.isEmpty(A())) {
            return true;
        }
        item.setOnMenuItemClickListener(this);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        bakg.b();
        bajp bajpVar = k;
        if (bajpVar != null) {
            bajpVar.j(bundle);
            return;
        }
        k = new bajp(this, bundle);
        if (!bakg.c(w(getIntent()))) {
            this.t = true;
        }
        k.n();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bajp bajpVar = k;
        if (bajpVar != null) {
            bajpVar.k(bundle);
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        bajp bajpVar = k;
        if (bajpVar != null) {
            bajpVar.l();
        }
    }

    @Override // defpackage.bagv
    public final void p() {
        bajp bajpVar = k;
        if (bajpVar != null) {
            bajpVar.l();
        }
        if (!bakg.c(w(getIntent())) || this.x == null) {
            finish();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.dui_slide_down);
        loadAnimation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        this.x.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new bais(this));
        D(q(), r(), 500);
    }

    public final int q() {
        return imw.f(getColor(R.color.gm3_ref_palette_black), 102);
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

    final arts t() {
        arts artsVar = new arts();
        artsVar.d = getPackageName();
        artsVar.e = getPackageName();
        artsVar.a = getApplicationInfo().uid;
        return artsVar;
    }

    public final arts u() {
        String str = null;
        Account account = TextUtils.isEmpty(this.v) ? null : new Account(this.v, "com.google");
        arts t = t();
        if (account != null) {
            try {
                str = uoh.f(this, account, "oauth2:https://www.googleapis.com/auth/supportcontent");
            } catch (IOException | unx unused) {
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
        bama.i = errorReport.Z;
        if (TextUtils.isEmpty(errorReport.ag)) {
            errorReport.ag = bapk.c();
        }
        return errorReport;
    }

    final bajp y(Parcelable parcelable, ErrorReport errorReport, Long l2) {
        Screenshot c;
        Screenshot screenshot = null;
        if (bajx.e(errorReport)) {
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
        bajp bajpVar = new bajp(this, errorReport, screenshot, l2);
        bajpVar.n();
        return bajpVar;
    }

    @Override // defpackage.baka
    public final ensv z() {
        return this.B;
    }

    @Override // defpackage.bagv, defpackage.baka, defpackage.bajq
    public final Context b() {
        return this;
    }

    @Override // defpackage.bagv
    public final baka c() {
        return this;
    }

    @Override // defpackage.bajq
    public final bagv v() {
        return this;
    }

    @Override // defpackage.bagv
    public final void h(String str) {
    }
}
