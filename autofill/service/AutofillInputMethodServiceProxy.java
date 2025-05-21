package com.google.android.gms.autofill.service;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy;
import defpackage.adqo;
import defpackage.adqq;
import defpackage.aeju;
import defpackage.afmz;
import defpackage.afvm;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asot;
import defpackage.asrk;
import defpackage.byhr;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.iwj;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AutofillInputMethodServiceProxy extends InputMethodService {
    public static final asot a = asot.b("AutofillImeProxy", asej.AUTOFILL);
    public adqo e;
    public ViewGroup f;
    public String g;
    public String h;
    private EditorInfo k;
    private boolean l;
    public final Executor b = new asrk(new byhr());
    private final ServiceConnection j = new afvm(this);
    public final adqq c = new adqq(this);
    public final CountDownLatch d = new CountDownLatch(1);
    public int i = 1;

    private final void f(afmz afmzVar, eiid eiidVar) {
        try {
            this.d.await(10L, TimeUnit.MILLISECONDS);
            if (this.e == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 1161)).x("coreService is null, logEvent failed");
                return;
            }
            try {
                int ordinal = afmzVar.ordinal();
                if (ordinal == 1) {
                    this.e.d(afmz.USER_ENTER.a(), this.k);
                    return;
                }
                if (ordinal == 3) {
                    if (eiidVar.h()) {
                        this.e.e(((aeju) eiidVar.c()).a(), this.k);
                    }
                } else if (ordinal != 4) {
                    ((ejhf) ((ejhf) a.j()).ah(1158)).B("logEvent failed, unknown event type: %s", afmzVar.name());
                } else {
                    this.e.d(afmz.EXIT.a(), this.k);
                }
            } catch (RemoteException e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 1159)).B("logEvent(): failed to log %s event", afmzVar.name());
            }
        } catch (InterruptedException e2) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 1162)).x("service connection failed");
        }
    }

    private final void g(View.OnClickListener onClickListener) {
        ((ImageButton) this.f.findViewById(R.id.back_button)).setOnClickListener(onClickListener);
    }

    private final void h(boolean z) {
        ((ImageButton) this.f.findViewById(R.id.switch_keyboard_button)).setVisibility(true != z ? 4 : 0);
    }

    private final void i(int i) {
        ((TextView) this.f.findViewById(R.id.keyboard_title_text)).setText(i);
    }

    private final void j() {
        ((ImageButton) this.f.findViewById(R.id.back_button)).setVisibility(0);
    }

    public final void a(aeju aejuVar) {
        f(afmz.SELECT, eiid.j(aejuVar));
    }

    public final void b(afmz afmzVar) {
        super.switchToPreviousInputMethod();
        f(afmzVar, eigb.a);
    }

    public final /* synthetic */ void c(Intent intent) {
        startActivity(intent);
        super.switchToPreviousInputMethod();
    }

    public final void d(String str) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 1171)).x("inputConnection is null");
        } else {
            currentInputConnection.deleteSurroundingText(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            currentInputConnection.commitText(str, 1);
        }
    }

    public final void e(int i) {
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
            ((ejhf) ((ejhf) a.j()).ah((char) 1179)).x("new state shouldn't be STATE_INITIAL");
        } else if (i4 == 1) {
            ((LinearLayout) this.f.findViewById(R.id.keyboard_home_layout)).setVisibility(0);
            g(new View.OnClickListener() { // from class: afvc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.b(afmz.EXIT);
                }
            });
            j();
            h(false);
            i(R.string.autofill_ime_title);
            TextView textView = (TextView) this.f.findViewById(R.id.home_payment_button_text);
            textView.setBackgroundResource(R.drawable.ime_top_item_background);
            textView.setOnClickListener(new View.OnClickListener() { // from class: afvd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.e(4);
                }
            });
            TextView textView2 = (TextView) this.f.findViewById(R.id.home_password_button_text);
            textView2.setBackgroundResource(R.drawable.ime_bottom_item_background);
            if (!this.l) {
                try {
                    final Intent a2 = this.e.a(this.k.packageName);
                    if (a2 != null) {
                        a2.addFlags(268435456);
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: afvj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AutofillInputMethodServiceProxy.this.c(a2);
                            }
                        });
                    }
                } catch (RemoteException unused) {
                }
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: afva
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.e(3);
                }
            });
        } else if (i4 == 2) {
            ((ViewGroup) this.f.findViewById(R.id.keyboard_password_layout)).setVisibility(0);
            g(new View.OnClickListener() { // from class: afuz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.e(2);
                }
            });
            j();
            h(true);
            i(R.string.keyboard_password_view_title);
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 1146)).x("getCredentialsForPackage failed");
            }
            adqo adqoVar = this.e;
            if (adqoVar == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 1145)).x("coreService is null");
            } else {
                try {
                    adqoVar.b(this.k.packageName);
                } catch (RemoteException e2) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 1144)).x("getCredentialsForPackage failed");
                }
            }
        } else if (i4 == 3) {
            ((ViewGroup) this.f.findViewById(R.id.keyboard_payment_layout)).setVisibility(0);
            g(new View.OnClickListener() { // from class: afvb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutofillInputMethodServiceProxy.this.e(2);
                }
            });
            j();
            h(true);
            i(R.string.keyboard_payment_view_title);
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e3)).ah((char) 1150)).x("service connection failed");
            }
            adqo adqoVar2 = this.e;
            if (adqoVar2 == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 1149)).x("coreService is null");
            } else {
                try {
                    adqoVar2.c(this.k.packageName);
                } catch (RemoteException e4) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e4)).ah((char) 1148)).x("getCredentialsForPackage failed");
                }
            }
        }
        this.i = i;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e(this.i);
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!asiu.a().e(this, "com.google.android.gms.autofill.service.AutofillImeCoreService", new Intent().setClassName(this, "com.google.android.gms.autofill.service.AutofillImeCoreService"), this.j, 1)) {
            ((ejhf) ((ejhf) a.j()).ah((char) 1141)).x("System didn't find data fetch service");
        }
        getTheme().applyStyle(R.style.AutofillImeTheme, true);
        getTheme().applyStyle(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_DayNight, true);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateInputView() {
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.autofill_keyboard, (ViewGroup) null);
        this.f = viewGroup;
        ((ImageButton) viewGroup.findViewById(R.id.switch_keyboard_button)).setOnClickListener(new View.OnClickListener() { // from class: afve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutofillInputMethodServiceProxy.this.b(afmz.EXIT);
            }
        });
        this.f.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: afvf
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets windowInsets2;
                asot asotVar = AutofillInputMethodServiceProxy.a;
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
        iwj iwjVar = new iwj(window, window.getDecorView());
        if (i == 32) {
            iwjVar.a(false);
        } else {
            iwjVar.a(true);
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
        asiu.a().b(this, this.j);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        EditorInfo editorInfo2 = this.k;
        if (editorInfo2 != null && !editorInfo2.packageName.equals(editorInfo.packageName)) {
            b(afmz.EXIT);
        }
        this.k = editorInfo;
        if (this.i == 1) {
            try {
                this.l = this.e.m(editorInfo.packageName);
            } catch (RemoteException e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 1173)).x("fetchCredentialImeCache failed");
            }
            if (this.l) {
                e(3);
                return;
            }
            this.g = null;
            this.h = null;
            try {
                this.d.await(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 1178)).x("fetch payment cache interrupted");
            }
            if (this.e == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 1177)).x("coreService is null, fetch payement cache failed");
            } else {
                try {
                    String str = this.k.packageName;
                    String[] n = this.e.n(this.k.packageName);
                    String str2 = n[0];
                    String str3 = n[1];
                    if (str2 != null && !str2.isEmpty()) {
                        this.g = str2;
                        this.h = str3;
                        e(4);
                        return;
                    }
                } catch (RemoteException e3) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e3)).ah((char) 1176)).x("getPaymentCards failed");
                }
            }
            e(2);
            f(afmz.USER_ENTER, eigb.a);
        }
    }
}
