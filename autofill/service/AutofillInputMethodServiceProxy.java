package com.google.android.gms.autofill.service;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InlineSuggestion;
import android.view.inputmethod.InlineSuggestionInfo;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.view.inputmethod.InlineSuggestionsResponse;
import android.view.inputmethod.InputConnection;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.inline.InlinePresentationSpec;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy;
import defpackage.afqv;
import defpackage.afqx;
import defpackage.agkg;
import defpackage.aha;
import defpackage.ahb;
import defpackage.ahc;
import defpackage.ahd;
import defpackage.ahi;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahl;
import defpackage.ahnl;
import defpackage.ahwb;
import defpackage.ahwe;
import defpackage.auid;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.auve;
import defpackage.caqj;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.hdh$$ExternalSyntheticApiModelOutline0;
import defpackage.itr;
import defpackage.ixz;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.LocalTime;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AutofillInputMethodServiceProxy extends InputMethodService {
    public static final ausn a = ausn.b("AutofillImeProxy", auid.AUTOFILL);
    public afqv e;
    public ViewGroup f;
    public String g;
    public String h;
    private EditorInfo l;
    private boolean m;
    public final Executor b = new auve(new caqj());
    private final ServiceConnection j = new ahwb(this);
    public final afqx c = new afqx(this);
    public final CountDownLatch d = new CountDownLatch(1);
    private final int k = (int) Duration.between(LocalTime.MIDNIGHT, LocalTime.now(Clock.systemUTC())).toMillis();
    public int i = 1;

    private final void g(ahnl ahnlVar, ekvi ekviVar) {
        try {
            this.d.await(10L, TimeUnit.MILLISECONDS);
            if (this.e == null) {
                ((eluo) ((eluo) a.j()).ai((char) 1156)).x("coreService is null, logEvent failed");
                return;
            }
            try {
                int ordinal = ahnlVar.ordinal();
                if (ordinal == 1) {
                    this.e.d(ahnl.USER_ENTER.a(), this.l, this.k);
                    return;
                }
                if (ordinal == 3) {
                    if (ekviVar.h()) {
                        this.e.e(((agkg) ekviVar.c()).a(), this.l, this.k);
                    }
                } else if (ordinal != 4) {
                    ((eluo) ((eluo) a.j()).ai(1153)).B("logEvent failed, unknown event type: %s", ahnlVar.name());
                } else {
                    this.e.d(ahnl.EXIT.a(), this.l, this.k);
                }
            } catch (RemoteException e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 1154)).B("logEvent(): failed to log %s event", ahnlVar.name());
            }
        } catch (InterruptedException e2) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 1157)).x("service connection failed");
        }
    }

    private final void h(View.OnClickListener onClickListener) {
        ((ImageButton) this.f.findViewById(R.id.back_button)).setOnClickListener(onClickListener);
    }

    private final void i(boolean z) {
        ((ImageButton) this.f.findViewById(R.id.switch_keyboard_button)).setVisibility(true != z ? 4 : 0);
    }

    private final void j(int i) {
        ((TextView) this.f.findViewById(R.id.keyboard_title_text)).setText(i);
    }

    private final void k() {
        ((ImageButton) this.f.findViewById(R.id.back_button)).setVisibility(0);
    }

    public final void a(agkg agkgVar) {
        g(ahnl.SELECT, ekvi.j(agkgVar));
    }

    public final void b(ahnl ahnlVar) {
        super.switchToPreviousInputMethod();
        g(ahnlVar, ektg.a);
    }

    public final void c(List list) {
        list.size();
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            return;
        }
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewGroup.findViewById(R.id.keyboard_suggestion_strip_scroll_view);
        if (horizontalScrollView.getVisibility() == 0) {
            ((LinearLayout) this.f.findViewById(R.id.keyboard_suggestion_strip)).removeAllViews();
        }
        if (list.isEmpty()) {
            horizontalScrollView.setVisibility(8);
            return;
        }
        horizontalScrollView.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) this.f.findViewById(R.id.keyboard_suggestion_strip);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            view.animate().setDuration(150L).setInterpolator(decelerateInterpolator).scaleX(1.0f).scaleY(1.0f).setStartDelay(i).start();
            i += 50;
        }
        horizontalScrollView.scrollTo(0, 0);
    }

    public final /* synthetic */ void d(Intent intent) {
        startActivity(intent);
        super.switchToPreviousInputMethod();
    }

    public final void e(String str) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            ((eluo) ((eluo) a.j()).ai((char) 1173)).x("inputConnection is null");
        } else {
            currentInputConnection.deleteSurroundingText(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            currentInputConnection.commitText(str, 1);
        }
    }

    public final void f(int i) {
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0 || i3 == 1) {
            this.f.findViewById(R.id.keyboard_home_layout).setVisibility(8);
        } else if (i3 == 2) {
            this.f.findViewById(R.id.keyboard_password_layout).setVisibility(8);
        } else if (i3 == 3) {
            this.f.findViewById(R.id.keyboard_payment_layout).setVisibility(8);
        }
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            ((eluo) ((eluo) a.j()).ai((char) 1181)).x("new state shouldn't be STATE_INITIAL");
        } else if (i4 == 1) {
            ((LinearLayout) this.f.findViewById(R.id.keyboard_home_layout)).setVisibility(0);
            h(new View.OnClickListener() { // from class: ahvr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.b(ahnl.EXIT);
                }
            });
            k();
            i(false);
            j(R.string.autofill_ime_title);
            TextView textView = (TextView) this.f.findViewById(R.id.home_payment_button_text);
            textView.setBackgroundResource(R.drawable.ime_top_item_background);
            textView.setOnClickListener(new View.OnClickListener() { // from class: ahvs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.f(4);
                }
            });
            TextView textView2 = (TextView) this.f.findViewById(R.id.home_password_button_text);
            textView2.setBackgroundResource(R.drawable.ime_bottom_item_background);
            if (!this.m) {
                try {
                    final Intent a2 = this.e.a(this.l.packageName);
                    if (a2 != null) {
                        a2.addFlags(268435456);
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: ahvn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AutofillInputMethodServiceProxy.this.d(a2);
                            }
                        });
                    }
                } catch (RemoteException unused) {
                }
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ahvo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.f(3);
                }
            });
        } else if (i4 == 2) {
            ((ViewGroup) this.f.findViewById(R.id.keyboard_password_layout)).setVisibility(0);
            h(new View.OnClickListener() { // from class: ahvl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.f(2);
                }
            });
            k();
            i(true);
            j(R.string.keyboard_password_view_title);
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 1140)).x("getCredentialsForPackage failed");
            }
            afqv afqvVar = this.e;
            if (afqvVar == null) {
                ((eluo) ((eluo) a.j()).ai((char) 1139)).x("coreService is null");
            } else {
                try {
                    afqvVar.b(this.l.packageName);
                } catch (RemoteException e2) {
                    ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 1138)).x("getCredentialsForPackage failed");
                }
            }
        } else if (i4 == 3) {
            ((ViewGroup) this.f.findViewById(R.id.keyboard_payment_layout)).setVisibility(0);
            h(new View.OnClickListener() { // from class: ahvq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy autofillInputMethodServiceProxy = AutofillInputMethodServiceProxy.this;
                    autofillInputMethodServiceProxy.f(2);
                    autofillInputMethodServiceProxy.g = null;
                    autofillInputMethodServiceProxy.h = null;
                }
            });
            k();
            i(true);
            j(R.string.keyboard_payment_view_title);
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e3)).ai((char) 1144)).x("service connection failed");
            }
            afqv afqvVar2 = this.e;
            if (afqvVar2 == null) {
                ((eluo) ((eluo) a.j()).ai((char) 1143)).x("coreService is null");
            } else {
                try {
                    afqvVar2.c(this.l.packageName);
                } catch (RemoteException e4) {
                    ((eluo) ((eluo) ((eluo) a.j()).s(e4)).ai((char) 1142)).x("getCredentialsForPackage failed");
                }
            }
        }
        this.i = i;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(this.i);
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!aumo.a().e(this, "com.google.android.gms.autofill.service.AutofillImeCoreService", new Intent().setClassName(this, "com.google.android.gms.autofill.service.AutofillImeCoreService"), this.j, 1)) {
            ((eluo) ((eluo) a.j()).ai((char) 1135)).x("System didn't find data fetch service");
        }
        getTheme().applyStyle(R.style.AutofillImeTheme, true);
        getTheme().applyStyle(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_DayNight, true);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final InlineSuggestionsRequest onCreateInlineSuggestionsRequest(Bundle bundle) {
        InlinePresentationSpec.Builder style;
        InlinePresentationSpec build;
        InlineSuggestionsRequest.Builder maxSuggestionCount;
        InlineSuggestionsRequest build2;
        ((eluo) ((eluo) a.h()).ai((char) 1160)).x("onCreateInlineSuggestionsRequest()");
        if (Build.VERSION.SDK_INT <= 29) {
            return null;
        }
        ahd ahdVar = new ahd("style_v1");
        int d = ahwe.d(this) - ahwe.c(this, R.dimen.autofill_keyboard_suggestion_chip_height);
        int c = ahwe.c(this, R.dimen.inline_suggestion_chip_padding_horizontal);
        Icon createWithResource = Icon.createWithResource(this, R.drawable.ime_inline_suggestion_background);
        createWithResource.setTint(ahwe.a(this, R.attr.colorSurfaceContainerLowest));
        int a2 = ahwe.a(this, R.attr.colorOnSurface);
        ahd ahdVar2 = new ahd("view_style", null);
        Bundle bundle2 = ahdVar2.a;
        bundle2.putIntArray("padding", new int[]{c, 0, c, 0});
        int i = d / 2;
        bundle2.putIntArray("layout_margin", new int[]{0, i, 0, i});
        itr.i(createWithResource, "background icon should not be null");
        bundle2.putParcelable("background", createWithResource);
        ahk ahkVar = new ahk(ahdVar2.a);
        ahkVar.d();
        Bundle bundle3 = ahdVar.a;
        bundle3.putBundle("chip_style", ahkVar.a);
        ahd ahdVar3 = new ahd("text_view_style", null);
        ahi.b(a2, ahdVar3);
        ahi.c(ahwe.c(this, R.dimen.autofill_inline_suggestion_title_text_size), ahdVar3);
        ahi.d(ahdVar3);
        ahj a3 = ahi.a(ahdVar3);
        a3.d();
        bundle3.putBundle("title_style", a3.a);
        ahd ahdVar4 = new ahd("text_view_style", null);
        ahi.b(a2, ahdVar4);
        ahi.c(ahwe.c(this, R.dimen.autofill_inline_suggestion_subtitle_text_size), ahdVar4);
        ahi.d(ahdVar4);
        ahj a4 = ahi.a(ahdVar4);
        a4.d();
        bundle3.putBundle("subtitle_style", a4.a);
        ahl ahlVar = new ahl(bundle3);
        Set set = ahb.a;
        ArrayList<aha> arrayList = new ArrayList();
        if (!ahc.a("androidx.autofill.inline.ui.version:v1")) {
            throw new IllegalArgumentException("Unsupported style version: androidx.autofill.inline.ui.version:v1");
        }
        arrayList.add(ahlVar);
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Please put at least one style in the builder");
        }
        Bundle bundle4 = new Bundle();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (aha ahaVar : arrayList) {
            String b = ahaVar.b();
            arrayList2.add(ahaVar.b());
            bundle4.putBundle(b, ahaVar.a());
        }
        bundle4.putStringArrayList("androidx.autofill.inline.ui.version:key", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        style = new InlinePresentationSpec.Builder(new Size(ahwe.c(this, R.dimen.autofill_keyboard_inline_suggestion_min_width), ahwe.d(this)), new Size(ahwe.c(this, R.dimen.autofill_keyboard_inline_suggestion_max_width), ahwe.d(this))).setStyle(bundle4);
        build = style.build();
        arrayList3.add(build);
        maxSuggestionCount = new InlineSuggestionsRequest.Builder(arrayList3).setMaxSuggestionCount(9);
        build2 = maxSuggestionCount.build();
        return build2;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateInputView() {
        ((eluo) ((eluo) a.h()).ai((char) 1162)).x("OnCreateInputView()");
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.autofill_keyboard, (ViewGroup) null);
        this.f = viewGroup;
        ((ImageButton) viewGroup.findViewById(R.id.switch_keyboard_button)).setOnClickListener(new View.OnClickListener() { // from class: ahvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutofillInputMethodServiceProxy.this.b(ahnl.EXIT);
            }
        });
        this.f.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ahvw
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets windowInsets2;
                ausn ausnVar = AutofillInputMethodServiceProxy.a;
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                if (Build.VERSION.SDK_INT < 30) {
                    return windowInsets.consumeSystemWindowInsets();
                }
                windowInsets2 = WindowInsets.CONSUMED;
                return windowInsets2;
            }
        });
        Window window = getWindow().getWindow();
        int i = getResources().getConfiguration().uiMode & 48;
        ixz ixzVar = new ixz(window, window.getDecorView());
        if (i == 32) {
            ixzVar.a(false);
        } else {
            ixzVar.a(true);
        }
        ViewGroup viewGroup2 = this.f;
        float f = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.keyboard_main_body);
        int i2 = getResources().getConfiguration().orientation;
        ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        layoutParams.height = (int) (f * (i2 == 1 ? 0.33f : 0.45f));
        viewGroup3.setLayoutParams(layoutParams);
        return this.f;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        aumo.a().b(this, this.j);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onEvaluateFullscreenMode() {
        return false;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onInlineSuggestionsResponse(InlineSuggestionsResponse inlineSuggestionsResponse) {
        List inlineSuggestions;
        InlineSuggestionInfo info;
        boolean isPinned;
        Executor mainExecutor;
        Executor mainExecutor2;
        ((eluo) ((eluo) a.h()).ai((char) 1165)).x("onInlineSuggestionsResponse()");
        if (Build.VERSION.SDK_INT <= 29) {
            return false;
        }
        inlineSuggestions = inlineSuggestionsResponse.getInlineSuggestions();
        int size = inlineSuggestions.size();
        if (size == 0) {
            mainExecutor2 = getMainExecutor();
            mainExecutor2.execute(new Runnable() { // from class: ahvt
                @Override // java.lang.Runnable
                public final void run() {
                    AutofillInputMethodServiceProxy.this.c(new ArrayList());
                }
            });
            return true;
        }
        final View[] viewArr = new View[size];
        final AtomicInteger atomicInteger = new AtomicInteger(size);
        for (final int i = 0; i < size; i++) {
            InlineSuggestion m353m = hdh$$ExternalSyntheticApiModelOutline0.m353m(inlineSuggestions.get(i));
            info = m353m.getInfo();
            isPinned = info.isPinned();
            if (isPinned) {
                atomicInteger.get();
                viewArr[i] = null;
                atomicInteger.decrementAndGet();
            } else {
                Size size2 = new Size(-2, -2);
                mainExecutor = getMainExecutor();
                m353m.inflate(this, size2, mainExecutor, new Consumer() { // from class: ahvu
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        View[] viewArr2 = viewArr;
                        viewArr2[i] = aib$$ExternalSyntheticApiModelOutline0.m85m(obj);
                        if (atomicInteger.decrementAndGet() == 0) {
                            AutofillInputMethodServiceProxy autofillInputMethodServiceProxy = AutofillInputMethodServiceProxy.this;
                            Stream filter = DesugarArrays.stream(viewArr2).filter(new Predicate() { // from class: ahvp
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo478negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                @Override // java.util.function.Predicate
                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    View view = (View) obj2;
                                    ausn ausnVar = AutofillInputMethodServiceProxy.a;
                                    return view != null;
                                }
                            });
                            int i2 = elgo.d;
                            autofillInputMethodServiceProxy.c((elgo) filter.collect(elcq.a));
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        return true;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        ((eluo) ((eluo) a.h()).ai(1169)).Q("onStartInputView: editorInfo %s, restarting %s", editorInfo, z);
        EditorInfo editorInfo2 = this.l;
        if (editorInfo2 != null && !editorInfo2.packageName.equals(editorInfo.packageName)) {
            b(ahnl.EXIT);
        }
        this.l = editorInfo;
        if (this.i == 1) {
            try {
                this.m = this.e.m(editorInfo.packageName);
            } catch (RemoteException e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 1175)).x("fetchCredentialImeCache failed");
            }
            if (this.m) {
                f(3);
                return;
            }
            this.g = null;
            this.h = null;
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 1180)).x("fetch payment cache interrupted");
            }
            if (this.e == null) {
                ((eluo) ((eluo) a.j()).ai((char) 1179)).x("coreService is null, fetch payement cache failed");
            } else {
                try {
                    String str = this.l.packageName;
                    String[] n = this.e.n(this.l.packageName);
                    String str2 = n[0];
                    String str3 = n[1];
                    if (str2 != null && !str2.isEmpty()) {
                        this.g = str2;
                        this.h = str3;
                        f(4);
                        return;
                    }
                } catch (RemoteException e3) {
                    ((eluo) ((eluo) ((eluo) a.j()).s(e3)).ai((char) 1178)).x("getPaymentCards failed");
                }
            }
            f(2);
            g(ahnl.USER_ENTER, ektg.a);
        }
    }
}
